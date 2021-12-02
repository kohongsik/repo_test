package com.example.demo.user;


import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {

  private final UserService userService;

  @GetMapping
  public List<UserDto> getAll() {
    return this.userService.findAll().stream()
      .map(UserDto::new).collect(Collectors.toList());
  }
  @GetMapping(value = "/list")
  public ResponseEntity get() {
    // 마이바티스 테스트
    return ResponseEntity.ok(userService.get());
  }
}
