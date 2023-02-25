package com.linksyi.notdatabasebranchtable.mapper;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.linksyi.notdatabasebranchtable.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class UserMapperTest {

    @Autowired
    private UserMapper userMapper;


    @Test
    public void testBatchInsert(){
        for (int i = 0; i < 20; i++) {
            userMapper.insert(buildUser(String.valueOf(i)));
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

    @Test
    public void testQueryByIds(){
        List<Long> ids = List.of(1629129435091374082L, 1629129435091374084L, 1629129433895997441L, 1629129435091374083L);
        List<User> users = userMapper.selectBatchIds(ids);
        users.forEach(System.out::println);
    }

    @Test
    public void testQueryByIdsAndOrder(){
        List<Long> ids = List.of(1629129435091374082L, 1629129435091374084L, 1629129433895997441L, 1629129435091374083L);
        LambdaQueryWrapper<User> queryByIdsAndOrderWrapper = new QueryWrapper<User>().lambda()
                .in(User::getId, ids)
                .orderByAsc(User::getId);
        List<User> users = userMapper.selectList(queryByIdsAndOrderWrapper);
        users.forEach(System.out::println);
    }
}