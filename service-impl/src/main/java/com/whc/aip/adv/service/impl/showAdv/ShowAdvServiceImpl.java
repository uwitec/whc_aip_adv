package com.whc.aip.adv.service.impl.showAdv;

import com.wanhuchina.common.code.CommonCode;
import com.wanhuchina.common.exception.CommonException;
import com.whc.aip.adv.dao.adv.AdvOwnMapper;
import com.whc.aip.adv.model.response.JsonAdvResult;
import com.whc.aip.adv.model.utils.getWahoId;
import com.whc.aip.adv.service.impl.advUtils.ShowAdvUtils;
import com.whc.aip.adv.service.showAdv.ShowAdvService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by shenshanghua
 * Email shenshanghua@wanhuchina.com
 * Date：2017/8/7
 * Time：16:50
 */
@Service("showAdvService")
public class ShowAdvServiceImpl implements ShowAdvService {
    @Resource
    private AdvOwnMapper advOwnMapper;

    //private ShowAdvUtils showAdvUtils = (ShowAdvUtils) SpringContextUtil.getBean("ShowAdvUtils");

    @Resource
    private ShowAdvUtils showAdvUtils;

    @Override
    public List<JsonAdvResult> showInfoWace(String memberId,String wahoId) throws CommonException {
        try {
            //默认广告
            List<JsonAdvResult> dafaultList = advOwnMapper.AdvDefaultInfoWace();
            //投放广告
            List<JsonAdvResult> advResultList = advOwnMapper.AdvPutInWace(wahoId);

            List<JsonAdvResult> adv = showAdvUtils.getAdv(dafaultList, advResultList,memberId);
            return adv;
        } catch (CommonException e) {
            throw  new CommonException(e.getCode(),e.getMsg());
        } catch (Exception e){
            throw  new  CommonException(CommonCode.SQL_SELECT_ERROR.getCode(),"查询广告sql错误");
        }
    }

    @Override
    public List<JsonAdvResult> showInfoOrderEnd(String memberId, String orderId) throws CommonException {
        try {
            //默认广告
            List<JsonAdvResult> dafaultList = advOwnMapper.AdvDefaultInfoOrderEnd();
            //投放广告
            getWahoId wahoIdByOrderId = advOwnMapper.getWahoIdByOrderId(orderId);
            String wahoId = wahoIdByOrderId.getWahoId();
            List<JsonAdvResult> jsonAdvResults = advOwnMapper.AdvPutInOrderEnd(wahoId);

            List<JsonAdvResult> adv = showAdvUtils.getAdv(dafaultList, jsonAdvResults,memberId);

            return adv;
        } catch (CommonException e) {
            throw  new CommonException(e.getCode(),e.getMsg());
        } catch (Exception e){
            throw  new  CommonException(CommonCode.SQL_SELECT_ERROR.getCode(),"查询广告sql错误");
        }
    }
}
