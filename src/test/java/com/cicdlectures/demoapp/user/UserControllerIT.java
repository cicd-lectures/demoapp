package com.cicdlectures.demoapp.user;

import static org.assertj.core.api.Assertions.*;

import java.net.URL;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserControllerIT {

  @LocalServerPort
  private int port;

  private URL url;

  @Autowired
  private UserRepository userRepository;

  @Autowired
  private TestRestTemplate template;

  @BeforeEach
  public void setUp() throws Exception {
    this.url = new URL("http://localhost:" + port + "/users");
  }

  @AfterEach
  public void tearDown() throws Exception {
    this.userRepository.deleteAll();
  }

  @Test
  @DisplayName("lists all users")
  public void testUsersList() throws Exception {
    fail("not implemented");
  }

  @Test
  @DisplayName("filters users by name")
  public void testUsersListFiltersByName() throws Exception {
    fail("not implemented");
  }

}
