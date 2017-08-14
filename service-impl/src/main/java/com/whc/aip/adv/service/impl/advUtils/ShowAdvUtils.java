package com.whc.aip.adv.service.impl.advUtils;

import com.wanhuchina.common.code.CommonCode;
import com.wanhuchina.common.exception.CommonException;
import com.whc.aip.adv.dao.shows.AdvShowsMapper;
import com.whc.aip.adv.model.response.JsonAdvResult;
import com.whc.aip.adv.model.shows.AdvShows;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by shenshanghua
 * Email shenshanghua@wanhuchina.com
 * Date：2017/8/7
 * Time：17:34
 */
@Service("showAdvUtils")
public class ShowAdvUtils {

    @Resource
    private AdvShowsMapper advShowMapper;

    public  List<JsonAdvResult> getAdv(List<JsonAdvResult> dafaultList,List<JsonAdvResult> advResultList,String memberId) throws CommonException {
        List<JsonAdvResult> resultList = new ArrayList<JsonAdvResult>();//最终返回的广告
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date newDate1 = new Date();
        String format = dateFormat.format(newDate1);
        Date newDate = null;
        try {
            newDate = dateFormat.parse(format);
            SimpleDateFormat dateFormatByCom = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            SimpleDateFormat dataStr1 = new SimpleDateFormat("yyyy-MM-dd");
            String dataStr = dataStr1.format(newDate);
            if(advResultList.size()>0){//有投放的广告（订单，门店）
                for (int i = 0 ; i < advResultList.size() ; i++) {
                    String  timeStampHead = dataStr+" "+advResultList.get(i).getTimeFrom();
                    String  timeStampEnd = dataStr+" "+advResultList.get(i).getTimeTo();

                    if(newDate.before(dateFormatByCom.parse(timeStampEnd))&&newDate.after(dateFormatByCom.parse(timeStampHead))) {//在时间校验之内 开始派发广告
                        //进行时间的校验 如果进入该校验 则添加进入
                        resultList.add(advResultList.get(i));
                        //添加记录
                        AdvShows show = new AdvShows();
                        show.setActivityId(advResultList.get(i).getActivityId());
                        show.setShowsTime(dateFormat.format(new Date()));
                        show.setShowsUserId(memberId);
                        show.setShowsWahoId(advResultList.get(i).getWahoId());
                        advShowMapper.insertSelective(show);
                    }
                    if( i < advResultList.size()-1){
                        continue;
                    }else if(i == advResultList.size()-1 && resultList.size()==0){//没有通过校验的广告 使用默认广告
                        JsonAdvResult advResult = new JsonAdvResult();
                        for (JsonAdvResult adv : dafaultList) {
                            advResult = adv ;
                        }
                        resultList.add(advResult);
                    }
                }

            }else{//没有投放的广告,使用默认的广告（订单，门店）

                JsonAdvResult advResult = new JsonAdvResult();
                for (JsonAdvResult adv : dafaultList) {
                    advResult = adv ;
                }
                resultList.add(advResult);

            }
            return  resultList;

        } catch (Exception e){
            throw new CommonException(CommonCode.SERVER_ERROR.getCode(),"服务器内部出错");

        }
    }
}
