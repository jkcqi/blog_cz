package com.blog.mapper;

import com.blog.pojo.Letter;
import com.blog.pojo.LetterExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LetterMapper {
    long countByExample(LetterExample example);

    int deleteByExample(LetterExample example);

    int insert(Letter record);

    int insertSelective(Letter record);

    List<Letter> selectByExample(LetterExample example);

    int updateByExampleSelective(@Param("record") Letter record, @Param("example") LetterExample example);

    int updateByExample(@Param("record") Letter record, @Param("example") LetterExample example);
}