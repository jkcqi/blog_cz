package com.blog.mapper;

import com.blog.pojo.ActicleCategory;
import com.blog.pojo.ActicleCategoryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ActicleCategoryMapper {
    long countByExample(ActicleCategoryExample example);

    int deleteByExample(ActicleCategoryExample example);

    int insert(ActicleCategory record);

    int insertSelective(ActicleCategory record);

    List<ActicleCategory> selectByExample(ActicleCategoryExample example);

    int updateByExampleSelective(@Param("record") ActicleCategory record, @Param("example") ActicleCategoryExample example);

    int updateByExample(@Param("record") ActicleCategory record, @Param("example") ActicleCategoryExample example);
}