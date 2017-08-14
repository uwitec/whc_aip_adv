package com.whc.aip.adv.service.impl.ClickAndShow;

import com.wanhuchina.common.code.CommonCode;
import com.wanhuchina.common.exception.CommonException;
import com.whc.aip.adv.dao.shows.AdvClicksMapper;
import com.whc.aip.adv.model.shows.AdvClicks;
import com.whc.aip.adv.service.ClickAndShow.ClickandShowService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by shenshanghua
 * Email shenshanghua@wanhuchina.com
 * Date：2017/8/8
 * Time：11:24
 */
@Service("clickandShowService")
public class ClickAndShowImpl implements ClickandShowService {

    @Resource
    private AdvClicksMapper advClicksMapper;

    @Override
    public int addClick(AdvClicks advClicks) throws CommonException {
        try {
            if(advClicks!=null){
                int index = advClicksMapper.insertSelective(advClicks);
                return index;
            }else{
                throw  new CommonException(CommonCode.PARAM_ERROR.getCode(),"入参点击model为空");
            }
        } catch (CommonException e) {
            throw  new CommonException(CommonCode.SQL_UPD_ERROR.getCode(),"添加sql错误");
        }

    }
}
