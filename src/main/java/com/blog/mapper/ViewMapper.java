package com.blog.mapper;

import com.blog.pojo.View;
import com.blog.pojo.ViewExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ViewMapper {
    long countByExample(ViewExample example);

    int deleteByExample(ViewExample example);

    int insert(View record);

    int insertSelective(View record);

    List<View> selectByExample(ViewExample example);

    int updateByExampleSelective(@Param("record") View record, @Param("example") ViewExample example);

    int updateByExample(@Param("record") View record, @Param("example") ViewExample example);
}