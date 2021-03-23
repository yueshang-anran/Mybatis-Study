package com.kuang.pojo;

import lombok.Data;

import java.util.List;

/**
 * @author 书
 * @date 2021/3/14 - 18:59
 */

@Data
public class Teacher {

    private int id;
    private String name;
    private List<Student> students;
}
