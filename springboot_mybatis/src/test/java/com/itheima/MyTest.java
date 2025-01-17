package com.itheima;

import com.itheima.domain.User;
import com.itheima.mapper.Usermapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootMybatisApplication.class)
public class MyTest {
    @Autowired
    private Usermapper usermapper;
    @Test
    public void test(){
        List<User> users = usermapper.queryUserList();
        System.out.println(users);
    }
}
