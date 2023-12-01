package com.example.f23comp1011assignment_2;

import java.util.List;

public class ApiResponse {
    private int count;
    private String message;
    private String searchCriteria;
    private List<Car> results;

    public int getCount() {
        return count;
    }

    public String getMessage() {
        return message;
    }

    public String getSearchCriteria() {
        return searchCriteria;
    }

    public List<Car> getResults() {
        return results;
    }

    @Override
    public String toString() {
        return "ApiResponse{" +
                "count=" + count +
                ", message='" + message + '\'' +
                ", searchCriteria='" + searchCriteria + '\'' +
                ", results=" + results +
                '}';
    }

}
