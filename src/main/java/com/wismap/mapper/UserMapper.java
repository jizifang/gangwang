package com.wismap.mapper;

import com.wismap.model.User;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    @Results({ //2
            @Result(property = "id", column = "id"), //2
            @Result(property = "username", column = "username"),
            @Result(property = "password", column = "password")
    })
    @Select("SELECT * FROM user") //3
    List<User> selectAll();
}
