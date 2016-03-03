package com.smart.service;

import com.smart.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by spikelyh on 16/3/1.
 */
@Service
public class UserService {
    @Autowired
    private UserDao userMapper;

    //public UserMapper getUserMapper() {
     //   return userMapper;
   // }


    //public void setUserMapper(UserMapper userMapper) {
       // this.userMapper = userMapper;
    //}


    public void insert(){

        String s="sdfsdf";
        System.out.println("配置成功");
        userMapper.deleteByPrimaryKey(1);
        System.out.println("exit");

    }
}
