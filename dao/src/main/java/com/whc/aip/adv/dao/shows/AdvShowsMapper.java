package com.whc.aip.adv.dao.shows;

import com.whc.aip.adv.model.shows.AdvShows;
import com.whc.aip.adv.model.shows.AdvShowsExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdvShowsMapper {
    int countByExample(AdvShowsExample example);

    int deleteByExample(AdvShowsExample example);

    int deleteByPrimaryKey(String showsId);

    int insert(AdvShows record);

    int insertSelective(AdvShows record);

    List<AdvShows> selectByExample(AdvShowsExample example);

    AdvShows selectByPrimaryKey(String showsId);

    int updateByExampleSelective(@Param("record") AdvShows record, @Param("example") AdvShowsExample example);

    int updateByExample(@Param("record") AdvShows record, @Param("example") AdvShowsExample example);

    int updateByPrimaryKeySelective(AdvShows record);

    int updateByPrimaryKey(AdvShows record);
}