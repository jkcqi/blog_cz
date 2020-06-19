package com.blog.mapper;

import com.blog.pojo.Fans;
import com.blog.pojo.FansExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FansMapper {
    long countByExample(FansExample example);

    int deleteByExample(FansExample example);

    int insert(Fans record);

    int insertSelective(Fans record);

    List<Fans> selectByExample(FansExample example);

    int updateByExampleSelective(@Param("record") Fans record, @Param("example") FansExample example);

    int updateByExample(@Param("record") Fans record, @Param("example") FansExample example);
}