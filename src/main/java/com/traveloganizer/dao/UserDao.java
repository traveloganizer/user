package com.traveloganizer.dao;

import com.traveloganizer.dto.User;
import com.traveloganizer.query.UserQuery;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

  public User getUser(UserQuery query) {
    return new User();
  }

}
