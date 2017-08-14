package com.whc.aip.adv.dao.shows;

import com.whc.aip.adv.model.shows.AdvClicks;
import com.whc.aip.adv.model.shows.AdvClicksExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdvClicksMapper {
    int countByExample(AdvClicksExample example);

    int deleteByExample(AdvClicksExample example);

    int deleteByPrimaryKey(String clicksId);

    int insert(AdvClicks record);

    int insertSelective(AdvClicks record);

    List<AdvClicks> selectByExample(AdvClicksExample example);

    AdvClicks selectByPrimaryKey(String clicksId);

    int updateByExampleSelective(@Param("record") AdvClicks record, @Param("example") AdvClicksExample example);

    int updateByExample(@Param("record") AdvClicks record, @Param("example") AdvClicksExample example);

    int updateByPrimaryKeySelective(AdvClicks record);

    int updateByPrimaryKey(AdvClicks record);
}