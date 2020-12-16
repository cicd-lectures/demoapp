package com.cicdlectures.demoapp.user;

public class GreeterService {

  public String greet(User user) {
    if (user.getAge() < 10) {
      return "Hi";
    }

    if (user.getAge() < 20) {
      return "Hey";
    }

    return "Hello";
  }

}
