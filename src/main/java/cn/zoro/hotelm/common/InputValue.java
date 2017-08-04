package cn.zoro.hotelm.common;

import lombok.Data;

/**
 * Created by fanlei on 2017/8/3.
 */
@Data
public class InputValue<T> {
    private int memberid; //用户ID
    private String token; //登录用户的令牌
    private T reqdata;
    private int carorderid;
    private int modifytype;
    private String sidx;
    private String sord;
    private int page = 1; //当前页数
    private int rows = 20;//每页显示数量
}
