package com.whc.aip.adv.dao.category;

import com.whc.aip.adv.model.category.AdvCategory;
import com.whc.aip.adv.model.category.AdvCategoryExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AdvCategoryMapper {
    int countByExample(AdvCategoryExample example);

    int deleteByExample(AdvCategoryExample example);

    int deleteByPrimaryKey(String categoryId);

    int insert(AdvCategory record);

    int insertSelective(AdvCategory record);

    List<AdvCategory> selectByExample(AdvCategoryExample example);

    AdvCategory selectByPrimaryKey(String categoryId);

    int updateByExampleSelective(@Param("record") AdvCategory record, @Param("example") AdvCategoryExample example);

    int updateByExample(@Param("record") AdvCategory record, @Param("example") AdvCategoryExample example);

    int updateByPrimaryKeySelective(AdvCategory record);

    int updateByPrimaryKey(AdvCategory record);
}