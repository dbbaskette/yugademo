package org.dbbaskette.yugademo;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Long> {
    List<User> findUsersByIdIsIn(List<Long> id);
    User findUserById(long id);
    User findUserByUsername(String username);
    List<User> findUsersByLastnameStartsWith(String lastnamePrefix);
}
