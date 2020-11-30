package com.cicdlectures.demoapp.user;

public class User {

  private String name;

  private int age;

  public User(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public int getAge() {
    return this.age;
  }

  public String getName() {
    return this.name;
  }

}
