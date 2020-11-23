package com.cicdlectures.demoapp.user;

public interface UserRepository {
    public void saveUser(User user);

    public User findByName(String user);
}
