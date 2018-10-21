package com.successfactors.sfmooc.service;

import com.successfactors.sfmooc.domain.FetchParams;
import com.successfactors.sfmooc.domain.Session;
import com.successfactors.sfmooc.domain.SessionVO;

import java.util.List;
import java.util.Set;

public interface SessionService {
    int editSession(Session session);
    List<Session> getSessionList(FetchParams fetchParams);
    Session getSessionById(Integer id);
//    Session getSessionByDate(String date);
//    Session getSessionByOwner(String owner);
//    int updateCheckinCode(Integer sessionId, String checkinCode);
//    boolean isSessionOwnerOfToday(String userId);
//    Set<String> getAttendeeList();
//    int updateLuckyNumber(Integer sessionId, Integer luckyNumber);
//    List<SessionVO> loadHistorySessions();
//    String getCurrentSeason();
}
