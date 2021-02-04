package com.jnxaread.listener;

import org.apache.catalina.connector.Connector;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.stereotype.Component;

import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * SpringBoot优雅停机（未测试）
 *
 * @Author 未央
 * @Create 2021-02-04 10:11
 */
@Component
public class GracefulShutdown implements ApplicationListener<ContextClosedEvent> {
    private final Logger logger = LoggerFactory.getLogger(GracefulShutdown.class);
    private static volatile Connector connector;
    private static final int waitTime = 30;

    /**
     * 用于获取Tomcat连接器
     *
     * @return Tomcat连接器
     */
    @Bean
    public ServletWebServerFactory servletContainer() {
        TomcatServletWebServerFactory tomcat = new TomcatServletWebServerFactory();
        tomcat.addConnectorCustomizers(connect -> connector = connect);
        return tomcat;
    }

    /**
     * 监听【kill -15】命令
     *
     * @param contextClosedEvent 容器关闭事件
     */
    @Override
    public void onApplicationEvent(ContextClosedEvent contextClosedEvent) {
        long startTime = System.currentTimeMillis();
        //tomcat暂停对外服务
        connector.pause();
        //获取tomcat线程池
        Executor executor = connector.getProtocolHandler().getExecutor();
        if (executor instanceof ThreadPoolExecutor) {
            try {
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executor;
                //线程池优雅停止(不接收新的请求，等待任务运行完成后关闭线程池)
                threadPoolExecutor.shutdown();
                //堵塞等待一定时间，指定时间内关闭成功则返回true，解除堵塞；否则false
                if (threadPoolExecutor.awaitTermination(waitTime, TimeUnit.SECONDS)) {
                    logger.info("Tomcat thread pool closed,time:{}ms", System.currentTimeMillis() - startTime);
                }
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
