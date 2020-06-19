package com.blog.mapper;

import com.blog.pojo.Visitor;
import com.blog.pojo.VisitorExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface VisitorMapper {
    long countByExample(VisitorExample example);

    int deleteByExample(VisitorExample example);

    int insert(Visitor record);

    int insertSelective(Visitor record);

    List<Visitor> selectByExample(VisitorExample example);

    int updateByExampleSelective(@Param("record") Visitor record, @Param("example") VisitorExample example);

    int updateByExample(@Param("record") Visitor record, @Param("example") VisitorExample example);
}