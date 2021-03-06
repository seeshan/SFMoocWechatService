package com.successfactors.sfmooc.domain;

import java.util.Map;

public class Answer {
    private Integer sessionId;
    private String userId;
    private int points;
    private Map<Integer, String> answerMap;

    public Integer getSessionId() {
        return sessionId;
    }

    public void setSessionId(Integer sessionId) {
        this.sessionId = sessionId;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Map<Integer, String> getAnswerMap() {
        return answerMap;
    }

    public void setAnswerMap(Map<Integer, String> answerMap) {
        this.answerMap = answerMap;
    }
}
