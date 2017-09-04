package com.traveloganizer.service;

import com.traveloganizer.dto.User;
import com.traveloganizer.query.UserQuery;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

  User getUser(UserQuery query);

}
