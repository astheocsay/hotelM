package cn.zoro.hotelm.service;

import cn.zoro.hotelm.common.ReturnValue;
import cn.zoro.hotelm.dao.SampleDao;
import cn.zoro.hotelm.dto.SampleDto;
import cn.zoro.hotelm.entity.SampleEntity;
import cn.zoro.hotelm.formbean.Sampleformbean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by fanlei on 2017/8/4.
 */
@Service
public class SampleService {
    @Autowired
    private SampleDao dao;

    public ReturnValue<SampleDto> getUserInfo(Sampleformbean sampleformbean){
        ReturnValue<SampleDto> returnValue = new ReturnValue<SampleDto>();
        SampleEntity sampleEntity = dao.getOneUser(sampleformbean.getUserid());
        SampleDto sampleDto = new SampleDto();
        sampleDto.setPhonenumber(sampleEntity.getPhonenumber());
        sampleDto.setUsername(sampleEntity.getUsername());
        returnValue.setObject(sampleDto);
        return returnValue;
    }
}
