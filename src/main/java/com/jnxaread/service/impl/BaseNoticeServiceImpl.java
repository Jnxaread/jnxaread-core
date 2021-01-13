package com.jnxaread.service.impl;

import com.jnxaread.bean.wrap.NoticeWrap;
import com.jnxaread.dao.wrap.NoticeMapperWrap;
import com.jnxaread.service.BaseNoticeService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author 未央
 * @create 2020-05-05 18:02
 */
public class BaseNoticeServiceImpl implements BaseNoticeService {

    @Autowired(required = false)
    private NoticeMapperWrap noticeMapper;

    @Override
    public List<NoticeWrap> getNoticeWrapList() {
        return noticeMapper.findListWithUsername();
    }

    @Override
    public NoticeWrap getNoticeWrap(int id) {
        NoticeWrap noticeWrap = noticeMapper.findWithUsername(id);
        if (noticeWrap == null) {
            return null;
        }
        noticeMapper.updateViewCountByPrimaryKey(id);
        return noticeWrap;
    }

}
