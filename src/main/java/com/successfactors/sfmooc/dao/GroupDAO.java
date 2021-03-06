package com.successfactors.sfmooc.dao;

import com.successfactors.sfmooc.domain.Group;

import java.util.List;

public interface GroupDAO {
    List<Group> getGroups();
    boolean isUserInGroup(String userId, Integer groupId);
    int addUserToGroup(String userId, Integer groupId);
    int markSessionAsShared(String userId, Integer sessionId);
}
