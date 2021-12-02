package com.example.demo.user;

import java.util.List;

import com.example.demo.user.UserMapper.UserMapper;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {

  private final UserRepository userRepository;
  private final UserMapper userMapper;
  public List<User> findAll() {
    return this.userRepository.findAll();
  }
  public List<UserDto> get() {
    return userMapper.get();
  }
}
