package com.itheima.mapper;

import com.itheima.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface Usermapper {
    public List<User> queryUserList();


}
