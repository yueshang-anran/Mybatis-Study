package com.kuang.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 书
 * @date 2021/3/7 - 13:35
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    int id;
    String name;
    String pwd;

}
