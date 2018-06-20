package com.neusoft.mapper;

import com.neusoft.pojo.Fastdfsfile;
import com.neusoft.pojo.FastdfsfileExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FastdfsfileMapper {
    int countByExample(FastdfsfileExample example);

    int deleteByExample(FastdfsfileExample example);

    int deleteByPrimaryKey(String fileId);

    int insert(Fastdfsfile record);

    int insertSelective(Fastdfsfile record);

    List<Fastdfsfile> selectByExample(FastdfsfileExample example);

    Fastdfsfile selectByPrimaryKey(String fileId);

    int updateByExampleSelective(@Param("record") Fastdfsfile record, @Param("example") FastdfsfileExample example);

    int updateByExample(@Param("record") Fastdfsfile record, @Param("example") FastdfsfileExample example);

    int updateByPrimaryKeySelective(Fastdfsfile record);

    int updateByPrimaryKey(Fastdfsfile record);
}