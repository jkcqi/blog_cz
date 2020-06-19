package com.blog.service.impl;

import com.blog.mapper.LogMapper;
import com.blog.mapper.UserMapper;
import com.blog.pojo.Log;
import com.blog.pojo.LogExample;
import com.blog.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogServiceImpl implements LogService {

    @Autowired
    private LogMapper logMapper;

    @Override
    public void insertLog(Log log) {
        logMapper.insert(log);
    }

    @Override
    public List<Log> selectLogs() {
        LogExample logExample = new LogExample();
        LogExample.Criteria criteria = logExample.createCriteria();
        criteria.andUsernameNotLike("0");
        return logMapper.selectByExample(logExample);
    }
}
