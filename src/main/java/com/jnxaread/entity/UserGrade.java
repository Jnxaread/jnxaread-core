package com.jnxaread.entity;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author 未央
 * @create 2020-06-16 10:11
 */
@Configuration
@PropertySource("classpath:userGrade.properties")
@ConfigurationProperties(prefix = "grade")
@EnableConfigurationProperties(UserGrade.class)
@Data
public class UserGrade {

    private Integer login;

    private Integer newTopic;

    private Integer newReply;

    private Integer newComment;

    private Integer newFiction;

    private Integer newChapter;

}
