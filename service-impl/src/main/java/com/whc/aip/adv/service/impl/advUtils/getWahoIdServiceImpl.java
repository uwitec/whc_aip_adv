package com.whc.aip.adv.service.impl.advUtils;

import com.wanhuchina.common.code.CommonCode;
import com.wanhuchina.common.exception.CommonException;
import com.whc.aip.adv.dao.adv.AdvOwnMapper;
import com.whc.aip.adv.model.utils.getWahoId;
import com.whc.aip.adv.service.advUtils.someAdvUtilsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by shenshanghua
 * Email shenshanghua@wanhuchina.com
 * Date：2017/8/8
 * Time：13:10
 */
@Service("someAdvUtilsService")
public class getWahoIdServiceImpl implements someAdvUtilsService {
    @Resource
    private AdvOwnMapper advOwnMapper;


    @Override
    public String getWahoIdByOrderId(String orderId) throws CommonException {

        try {
            if(orderId!=null){
                getWahoId wahoIdByOrderId = advOwnMapper.getWahoIdByOrderId(orderId);
                String wahoId = wahoIdByOrderId.getWahoId();
                return wahoId;
            }else{
                throw  new CommonException(CommonCode.PARAM_ERROR.getCode(),"入参为空");
            }
        } catch (Exception e) {
            throw  new CommonException(CommonCode.SERVER_ERROR.getCode(),"服务器内部异常");
        }
    }
}
