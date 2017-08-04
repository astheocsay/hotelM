package cn.zoro.hotelm.common;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by fanlei on 2017/8/3.
 */
@Component
@ConfigurationProperties(prefix="hotelm")
@Data
public class Config {
    private String url;
    private String ucurl;
    private String imgcdnurl;
}
