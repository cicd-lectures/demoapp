package com.cicdlectures.demoapp.user;

import java.lang.Iterable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

  @Autowired
  private UserRepository users;

  @GetMapping(path = "/users", produces = "application/json")
  public Iterable<User> getUsers(@RequestParam(value = "name",defaultValue = "") String name) {
    if (!name.isBlank()) {
      return this.users.findByName(name);
    }

    return this.users.findAll();
  }

}
