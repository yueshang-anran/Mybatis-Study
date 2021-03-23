package com.kuang.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @author 书
 * @date 2021/3/21 - 15:43
 */
@Data
public class Blog {

    private String id;
    private String title;
    private String author;
    private Date createTime;
    private int views;
}
