package com.linksyi.readwritebranch.mapper;

import com.linksyi.readwritebranch.entity.User;
import com.linksyi.readwritebranch.entity.UserItem;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;

@SpringBootTest
class UserMapperTest {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserItemMapper userItemMapper;


    @Test
    public void testBatchSave(){
        for (int i = 0; i < 20; i++) {
            User user = buildUser(String.valueOf(i));
            userMapper.insert(user);
            UserItem userItem = buildUser(user.getId(), String.valueOf(i));
            userItemMapper.insert(userItem);
        }
    }

    private static User buildUser(String str) {
        User user = new User();
        user.setAccount(str);
        user.setAccount(str);
        user.setNickname(str);
        user.setPassword(str);
        return user;
    }

    private static UserItem buildUser(Long userId, String str) {
        UserItem userItem = new UserItem();
        userItem.setUserId(userId);
        userItem.setEmail(str);
        return userItem;
    }

    @Test
    public void testQueryByIds(){
        List<Long> ids = List.of(1629466183440855041L, 1629466184518791171L, 1629466184581705730L, 1629466184644620290L);
        List<Map<String, ?>> result = userMapper.queryUserDetailsByIds(ids);
        result.forEach(System.out::println);
    }
}