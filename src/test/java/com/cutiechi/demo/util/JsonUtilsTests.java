package com.cutiechi.demo.util;

import com.cutiechi.demo.model.entity.User;

import org.junit.jupiter.api.Test;

class JsonUtilsTests {
    
    @Test
    void testToJson () {
        User user = new User(20180903, "hello", "gson");
        String json = JsonUtils.toJson(user);
        System.out.println(json);
    }
}
