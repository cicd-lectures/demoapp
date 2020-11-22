package com.cicdlectures.demoapp.user;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class GreeterServiceTests {

  private GreeterService subject;

  @BeforeEach
  public void init() {
    this.subject = new GreeterService();
  }

  @Test
  @DisplayName("greets user with age below 10 with Hi")
  void greetsUserWithAgeBelow10WithHi() {
    User user = new User("John", 5);
    String result = this.subject.greet(user);
    assertEquals("Hi", result);
  }

  @Test
  @DisplayName("greets user with age between 10 and 20 with Hey")
  void greetsUserWithAgeBetween10And20WithHey() {
    User user = new User("John", 13);
    String result = this.subject.greet(user);
    assertEquals("Hey", result);
  }

  @Test
  @DisplayName("greets user above 20 with Hello")
  void greetsUserWithAgeBelow10WithHello() {
    User user = new User("John", 25);
    String result = this.subject.greet(user);
    assertEquals("Hello", result);
  }

}
