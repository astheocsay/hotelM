package cn.zoro.hotelm.common;

import lombok.Data;

import java.util.List;

/**
 * Created by fanlei on 2017/8/3.
 */
@Data
public class ReturnValue<T> {
    public static final int STATUS_SUCCESS = 100;
    public static final int STATUS_PARAM_ERROR = 101;
    public static final String MSG_SUCCESS = "操作成功";
    public static final int STATUS_ERR_SYSTEM = 444;
    public static final String MSG_ERR_SYSTEM = "系统出错";
    public static final String MSG_PARAM_ERROR = "参数错误";
    public static final int STATUS_ERROR = 102;
    public static final String MSG_ERROR = "操作失败";

    int status = STATUS_SUCCESS;//状态码
    String msg = MSG_SUCCESS;//描述
    T Object;//返回对象信息
    List<T> list;//返回数字信息

    String systemerrormsg;//系统报错信息

    private int currpage = 0;      //当前页数
    private int totalrecords = 0;  //全记录数
    private int totalpages = 0;    //全部页数

    private SummaryData summaryData;

}
