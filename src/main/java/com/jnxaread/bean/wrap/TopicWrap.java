package com.jnxaread.bean.wrap;

import com.jnxaread.bean.Topic;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * @author 未央
 * @create 2019-11-01 23:09
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class TopicWrap extends Topic {

    private String username;
    //最后回复者
    private String lastReply;
    //最后回复时间
    private Date lastSubmit;
}
