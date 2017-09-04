package com.traveloganizer.controller;

import com.traveloganizer.dto.User;
import com.traveloganizer.query.UserQuery;
import com.traveloganizer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class UserController {

  @Autowired
  UserService userService;

  @RequestMapping(value = "_user", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
  public User home(UserQuery query) {
    return userService.getUser(query);
  }
}
