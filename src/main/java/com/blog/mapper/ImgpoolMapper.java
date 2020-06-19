package com.blog.mapper;

import com.blog.pojo.Imgpool;
import com.blog.pojo.ImgpoolExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ImgpoolMapper {
    long countByExample(ImgpoolExample example);

    int deleteByExample(ImgpoolExample example);

    int insert(Imgpool record);

    int insertSelective(Imgpool record);

    List<Imgpool> selectByExample(ImgpoolExample example);

    int updateByExampleSelective(@Param("record") Imgpool record, @Param("example") ImgpoolExample example);

    int updateByExample(@Param("record") Imgpool record, @Param("example") ImgpoolExample example);
}