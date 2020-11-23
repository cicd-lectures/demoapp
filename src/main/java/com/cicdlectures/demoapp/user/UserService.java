package com.cicdlectures.demoapp.user;

public class UserService {

  private UserRepository repo;

  public UserService(UserRepository repo) {
    this.repo = repo;
  }

  public void createUser(User user) {
  }
}
