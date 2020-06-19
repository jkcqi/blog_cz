package com.blog.mapper;

import com.blog.pojo.ThumbsUp;
import com.blog.pojo.ThumbsUpExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ThumbsUpMapper {
    long countByExample(ThumbsUpExample example);

    int deleteByExample(ThumbsUpExample example);

    int insert(ThumbsUp record);

    int insertSelective(ThumbsUp record);

    List<ThumbsUp> selectByExample(ThumbsUpExample example);

    int updateByExampleSelective(@Param("record") ThumbsUp record, @Param("example") ThumbsUpExample example);

    int updateByExample(@Param("record") ThumbsUp record, @Param("example") ThumbsUpExample example);
}