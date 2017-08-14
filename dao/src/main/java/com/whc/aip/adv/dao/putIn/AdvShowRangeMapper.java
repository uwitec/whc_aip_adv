package com.whc.aip.adv.dao.putIn;

import com.whc.aip.adv.model.putIn.AdvShowRange;
import com.whc.aip.adv.model.putIn.AdvShowRangeExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdvShowRangeMapper {
    int countByExample(AdvShowRangeExample example);

    int deleteByExample(AdvShowRangeExample example);

    int deleteByPrimaryKey(String showrangeId);

    int insert(AdvShowRange record);

    int insertSelective(AdvShowRange record);

    List<AdvShowRange> selectByExample(AdvShowRangeExample example);

    AdvShowRange selectByPrimaryKey(String showrangeId);

    int updateByExampleSelective(@Param("record") AdvShowRange record, @Param("example") AdvShowRangeExample example);

    int updateByExample(@Param("record") AdvShowRange record, @Param("example") AdvShowRangeExample example);

    int updateByPrimaryKeySelective(AdvShowRange record);

    int updateByPrimaryKey(AdvShowRange record);
}