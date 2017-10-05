package com.example.demo.mapper;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Insert;

/**
 * Created by Administrator on 2017/10/3 0003.
 */
public interface UserMap {
    @Insert("INSERT INTO user (useName, passWor) VALUES ('小红', '12dw2')")
    void insert(User user);
}
