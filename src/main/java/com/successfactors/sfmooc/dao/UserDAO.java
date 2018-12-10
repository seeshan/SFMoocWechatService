package com.successfactors.sfmooc.dao;

import com.successfactors.sfmooc.domain.User;
import java.util.List;

public interface UserDAO {
    public int addUser(User user);
    User getUserById(String userId);
    List<User> getUsersByOrder();
    int editUserInfo(User user);
}
