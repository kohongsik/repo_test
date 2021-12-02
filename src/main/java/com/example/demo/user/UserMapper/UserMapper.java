package com.example.demo.user.UserMapper;

import com.example.demo.user.UserDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<UserDto> get();
}
