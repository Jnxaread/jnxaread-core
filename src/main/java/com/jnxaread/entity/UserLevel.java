package com.jnxaread.entity;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * 用户等级体系
 * 规定了每个等级需要的积分数量
 *
 * @author 未央
 * @create 2020-06-16 15:10
 */
@Data
@Configuration
@PropertySource("classpath:userLevel.properties")
@ConfigurationProperties(prefix = "level")
@EnableConfigurationProperties(UserLevel.class)
public class UserLevel {
    private Integer lv0;

    private Integer lv1;

    private Integer lv2;

    private Integer lv3;

    private Integer lv4;

    private Integer lv5;

    private Integer[] gradeArr;

    private Integer[] levelArr;
}
