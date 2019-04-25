package org.dbbaskette.yugademo;

import org.springframework.data.cassandra.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BasicUserRepository extends CrudRepository<User, Long> {


    @Query("SELECT * from users where user_id in(?0)")
    User findUserByIdIn(long id);
    User findUserByUsername(String username);
    List<User> findUsersByLastnameStartsWith(String lastnamePrefix);
}
