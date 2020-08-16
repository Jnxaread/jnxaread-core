package com.jnxaread.entity;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * 用户积分体系
 * 规定了用户的每次发布所能获得的积分
 *
 * @author 未央
 * @create 2020-06-16 10:11
 */
@Data
@Configuration
@PropertySource("classpath:userGrade.properties")
@ConfigurationProperties(prefix = "grade")
@EnableConfigurationProperties(UserGrade.class)
public class UserGrade {

    private Integer login;

    private Integer newTopic;

    private Integer newReply;

    private Integer newComment;

    private Integer newFiction;

    private Integer newChapter;

}
