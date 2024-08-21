package com.example;

import java.util.List;
import java.util.Objects;

public class Assignment {
    private String assignmentId;
    private String title;
    private String description;
    private String dueDate;
    private List<Question> questions;

    public Assignment(String assignmentId, String title, String description, String dueDate, List<Question> questions) {
        this.assignmentId = assignmentId;
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.questions = questions;
    }

    // Getters and Setters
    public String getAssignmentId() { return assignmentId; }
    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public String getDueDate() { return dueDate; }
    public List<Question> getQuestions() { return questions; }

    @Override
    public int hashCode() {
        return Objects.hash(assignmentId);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Assignment assignment = (Assignment) obj;
        return Objects.equals(assignmentId, assignment.assignmentId);
    }
}
