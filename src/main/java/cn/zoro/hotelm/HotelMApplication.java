package cn.zoro.hotelm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.io.IOException;

/**
 * Created by fanlei on 2017/8/3.
 */
@SpringBootApplication
public class HotelMApplication extends WebMvcConfigurerAdapter{
    public static void main(String[] args) throws IOException {
        SpringApplication.run(HotelMApplication.class, args);
    }
}
