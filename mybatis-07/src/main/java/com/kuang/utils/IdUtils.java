package com.kuang.utils;

import org.junit.Test;

import java.util.UUID;

/**
 * @author 书
 * @date 2021/3/21 - 15:52
 */
@SuppressWarnings("all")
public class IdUtils {

    public static String getId() {
        return UUID.randomUUID().toString().replace("-","");
    }

    @Test
    public void test() {
        System.out.println(IdUtils.getId());
    }
}
