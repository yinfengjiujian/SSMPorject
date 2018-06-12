package com.neusoft.mapper;

import com.neusoft.pojo.DemoItem;
import com.neusoft.pojo.DemoItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DemoItemMapper {
    int countByExample(DemoItemExample example);

    int deleteByExample(DemoItemExample example);

    int deleteByPrimaryKey(String id);

    int insert(DemoItem record);

    int insertSelective(DemoItem record);

    List<DemoItem> selectByExample(DemoItemExample example);

    DemoItem selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") DemoItem record, @Param("example") DemoItemExample example);

    int updateByExample(@Param("record") DemoItem record, @Param("example") DemoItemExample example);

    int updateByPrimaryKeySelective(DemoItem record);

    int updateByPrimaryKey(DemoItem record);
}