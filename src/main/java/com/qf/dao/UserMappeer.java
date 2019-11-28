package com.qf.dao;

import com.qf.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserMappeer {
    List<User> userList();
}
