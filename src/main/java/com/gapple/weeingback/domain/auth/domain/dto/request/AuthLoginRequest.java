package com.gapple.weeingback.domain.auth.domain.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class AuthLoginRequest {
  @Email
  @NotBlank
  private String email;

  @NotBlank
  private String password;
}
