package com.jnxaread.service;

import com.jnxaread.bean.Topic;
import com.jnxaread.bean.model.TopicModel;

/**
 * @author 未央
 * @create 2020-05-03 22:35
 */
public interface BaseForumService {

    int addTopic(Topic newTopic);

    TopicModel getTopicModel(int id);

}
