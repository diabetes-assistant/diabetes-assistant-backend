package com.github.diabetesassistant.domain;

import lombok.Value;

@Value
public class Tokens {
  AccessToken accessToken;
  IDToken idToken;
}