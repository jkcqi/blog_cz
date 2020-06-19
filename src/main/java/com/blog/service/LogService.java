package com.blog.service;


import com.blog.pojo.Log;

import java.util.List;

public interface LogService {

    void insertLog(Log log);
    List<Log> selectLogs();

}
