package com.example;

import java.util.Objects;

public class Result {
    private String resultId;
    private Student student;
    private Assignment assignment;
    private Trainer trainer;
    private int score;
    private String feedback;
    private String submissionDate;

    public Result(String resultId, Student student, Assignment assignment, Trainer trainer, int score, String feedback, String submissionDate) {
        this.resultId = resultId;
        this.student = student;
        this.assignment = assignment;
        this.trainer = trainer;
        this.score = score;
        this.feedback = feedback;
        this.submissionDate = submissionDate;
    }

    // Getters and Setters
    public String getResultId() { return resultId; }
    public Student getStudent() { return student; }
    public Assignment getAssignment() { return assignment; }
    public Trainer getTrainer() { return trainer; }
    public int getScore() { return score; }
    public String getFeedback() { return feedback; }
    public String getSubmissionDate() { return submissionDate; }

    @Override
    public int hashCode() {
        return Objects.hash(resultId);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Result result = (Result) obj;
        return Objects.equals(resultId, result.resultId);
    }
}
