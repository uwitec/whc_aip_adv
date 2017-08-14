package com.whc.aip.adv.dao.position;

import com.whc.aip.adv.model.position.AdvPosition;
import com.whc.aip.adv.model.position.AdvPositionExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AdvPositionMapper {
    int countByExample(AdvPositionExample example);

    int deleteByExample(AdvPositionExample example);

    int deleteByPrimaryKey(String positionId);

    int insert(AdvPosition record);

    int insertSelective(AdvPosition record);

    List<AdvPosition> selectByExample(AdvPositionExample example);

    AdvPosition selectByPrimaryKey(String positionId);

    int updateByExampleSelective(@Param("record") AdvPosition record, @Param("example") AdvPositionExample example);

    int updateByExample(@Param("record") AdvPosition record, @Param("example") AdvPositionExample example);

    int updateByPrimaryKeySelective(AdvPosition record);

    int updateByPrimaryKey(AdvPosition record);
}