package com.whc.aip.adv.dao.content;

import com.whc.aip.adv.model.content.advContent;
import com.whc.aip.adv.model.content.advContentExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface advContentMapper {
    int countByExample(advContentExample example);

    int deleteByExample(advContentExample example);

    int deleteByPrimaryKey(String contentId);

    int insert(advContent record);

    int insertSelective(advContent record);

    List<advContent> selectByExample(advContentExample example);

    advContent selectByPrimaryKey(String contentId);

    int updateByExampleSelective(@Param("record") advContent record, @Param("example") advContentExample example);

    int updateByExample(@Param("record") advContent record, @Param("example") advContentExample example);

    int updateByPrimaryKeySelective(advContent record);

    int updateByPrimaryKey(advContent record);
}