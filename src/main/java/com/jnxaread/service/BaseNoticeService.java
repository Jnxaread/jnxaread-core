package com.jnxaread.service;

import com.jnxaread.bean.wrap.NoticeWrap;

import java.util.List;

/**
 * @author 未央
 * @create 2020-05-05 18:01
 */
public interface BaseNoticeService {

    List<NoticeWrap> getNoticeWrapList(Integer visible);

    NoticeWrap getNoticeWrap(int id);

}
