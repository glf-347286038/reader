package com.reader.util;/*
 * @Author 高凌峰
 * @Date 2020-09-20 15:48
 * 统一后端的返回实体
 */
import lombok.Data;
//@Getter
//@Setter
@Data //相当于get\set\toString都有了hashcode
public class ResponseData {
    //返回正确或错误信息
    private String message;
    //错误编码
    private short code;
    //是否成功
    private boolean succsess;
    //返回数据
    private Object data;
}
