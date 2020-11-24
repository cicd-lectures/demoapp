package com.cicdlectures.demoapp.user;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.fail;

import org.mockito.Mock;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.never;

class UserServiceTests {

  private UserRepository repository;

  private UserService subject;

  @BeforeEach
  public void init() {
    this.repository = mock(UserRepository.class);
    this.subject = new UserService(this.repository);
  }

  @Test
  @DisplayName("creates an user")
  public void createsUser() {
    User user = new User("foo", 10);
    when(repository.findByName("foo")).thenReturn(null);

    subject.createUser(user);

    verify(this.repository).saveUser(user);
  }

  @Test
  @DisplayName("does not create a user if it already exists")
  public void doesNotcreateUserIfAlreadyExists() {
    User user = new User("foo", 10);
    when(repository.findByName("foo")).thenReturn(user);

    subject.createUser(user);

    verify(this.repository, never()).saveUser(user);
  }

}
