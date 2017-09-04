package com.traveloganizer.service;

import com.traveloganizer.dao.UserDao;
import com.traveloganizer.dto.User;
import com.traveloganizer.query.UserQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

  @Autowired
  UserDao userDao;

  @Override
  public User getUser(UserQuery query) {
    return userDao.getUser(query);
  }
}
