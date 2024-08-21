package com.example;

import java.util.ArrayList;
import java.util.List;

public class ResultsData {
    private List<Result> results;

    public ResultsData() {
        this.results = new ArrayList<>();
    }

    public void addResult(Result result) {
        results.add(result);
    }

    public List<Result> getResultsByStudent(Student student) {
        List<Result> studentResults = new ArrayList<>();
        for (Result result : results) {
            if (result.getStudent().equals(student)) {
                studentResults.add(result);
            }
        }
        return studentResults;
    }

    public List<Result> getAllResults() {
        return results;
    }
}
