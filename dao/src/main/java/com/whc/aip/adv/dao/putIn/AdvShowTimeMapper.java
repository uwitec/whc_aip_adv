package com.whc.aip.adv.dao.putIn;

import com.whc.aip.adv.model.putIn.AdvShowTime;
import com.whc.aip.adv.model.putIn.AdvShowTimeExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdvShowTimeMapper {
    int countByExample(AdvShowTimeExample example);

    int deleteByExample(AdvShowTimeExample example);

    int deleteByPrimaryKey(String showtimeId);

    int insert(AdvShowTime record);

    int insertSelective(AdvShowTime record);

    List<AdvShowTime> selectByExample(AdvShowTimeExample example);

    AdvShowTime selectByPrimaryKey(String showtimeId);

    int updateByExampleSelective(@Param("record") AdvShowTime record, @Param("example") AdvShowTimeExample example);

    int updateByExample(@Param("record") AdvShowTime record, @Param("example") AdvShowTimeExample example);

    int updateByPrimaryKeySelective(AdvShowTime record);

    int updateByPrimaryKey(AdvShowTime record);
}