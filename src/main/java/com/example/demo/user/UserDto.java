package com.example.demo.user;

import static org.springframework.beans.BeanUtils.copyProperties;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
  private Integer id;
  private String name;
  @JsonProperty("created_at")
  private LocalDateTime createdAt;

  public UserDto(User source) {
    copyProperties(source, this);
  }
}
