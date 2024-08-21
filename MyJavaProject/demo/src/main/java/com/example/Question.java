package com.example;

import java.util.List;
import java.util.Objects;

public class Question {
    private String questionId;
    private List<String> answers;
    private String answerKey;
    private int score;
    private String techStackId;
    private String assignmentId;

    public Question(String questionId, List<String> answers, String answerKey, int score, String techStackId, String assignmentId) {
        this.questionId = questionId;
        this.answers = answers;
        this.answerKey = answerKey;
        this.score = score;
        this.techStackId = techStackId;
        this.assignmentId = assignmentId;
    }

    // Getters and Setters
    public String getQuestionId() { return questionId; }
    public List<String> getAnswers() { return answers; }
    public String getAnswerKey() { return answerKey; }
    public int getScore() { return score; }
    public String getTechStackId() { return techStackId; }
    public String getAssignmentId() { return assignmentId; }

    @Override
    public int hashCode() {
        return Objects.hash(questionId);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Question question = (Question) obj;
        return Objects.equals(questionId, question.questionId);
    }
}
