package com.cicdlectures.demoapp.user;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {

    public List<User> findByName(String name);

}
