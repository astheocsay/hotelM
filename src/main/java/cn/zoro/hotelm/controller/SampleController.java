package cn.zoro.hotelm.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by fanlei on 2017/8/3.
 */
@RestController
@RequestMapping("/sample")
public class SampleController {
    @RequestMapping("/test")
    public String test() throws Exception {
        return "run demo";
    }
}
