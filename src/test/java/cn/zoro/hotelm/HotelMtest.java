package cn.zoro.hotelm;

import cn.zoro.hotelm.common.ReturnValue;
import cn.zoro.hotelm.dto.SampleDto;
import cn.zoro.hotelm.formbean.Sampleformbean;
import cn.zoro.hotelm.service.SampleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by fanlei on 2017/8/4.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class HotelMtest {
    @Autowired
    private SampleService service;

    @Test
    public void testSampleService() {
        Sampleformbean sampleformbean = new Sampleformbean();
        sampleformbean.setUserid(123);
        sampleformbean.setName("咖色蛋糕");
        ReturnValue<SampleDto> returnValue = service.getUserInfo(sampleformbean);
        SampleDto sampleDto = returnValue.getObject();
        System.out.println(sampleDto.getUsername());
        System.out.println(sampleDto.getPhonenumber());
        returnValue = service.getUserListInfo(sampleformbean);

        List<SampleDto> list = returnValue.getList();
        for (SampleDto sampleDto1 : list) {
            System.out.println("==============>>>>>>>>>>>>>>>"+sampleDto1.getUsername());
            System.out.println("==============>>>>>>>>>>>>>>>"+sampleDto1.getPhonenumber());
        }
    }
    @Test
    public void testSampleService2() {
        Sampleformbean sampleformbean = new Sampleformbean();
//        sampleformbean.setUserid(123);
        sampleformbean.setName("咖色蛋糕");
        ReturnValue<SampleDto> returnValue = service.getUserList(sampleformbean);

        List<SampleDto> list = returnValue.getList();
        for (SampleDto sampleDto : list) {
            System.out.println("==============>>>>>>>>>>>>>>>"+sampleDto.getUsername());
            System.out.println("==============>>>>>>>>>>>>>>>"+sampleDto.getPhonenumber());
        }
    }

}
