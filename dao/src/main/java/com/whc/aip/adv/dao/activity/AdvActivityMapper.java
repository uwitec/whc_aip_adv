package com.whc.aip.adv.dao.activity;

import com.whc.aip.adv.model.activity.AdvActivity;
import com.whc.aip.adv.model.activity.AdvActivityExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AdvActivityMapper {
    int countByExample(AdvActivityExample example);

    int deleteByExample(AdvActivityExample example);

    int deleteByPrimaryKey(String activityId);

    int insert(AdvActivity record);

    int insertSelective(AdvActivity record);

    List<AdvActivity> selectByExample(AdvActivityExample example);

    AdvActivity selectByPrimaryKey(String activityId);

    int updateByExampleSelective(@Param("record") AdvActivity record, @Param("example") AdvActivityExample example);

    int updateByExample(@Param("record") AdvActivity record, @Param("example") AdvActivityExample example);

    int updateByPrimaryKeySelective(AdvActivity record);

    int updateByPrimaryKey(AdvActivity record);
}