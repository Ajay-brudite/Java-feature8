package com.example;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainAnDummy {
    public static void main(String[] args) {
        List<Student> students = createDummyStudents();
        List<Trainer> trainers = createDummyTrainers();
        List<Assignment> assignments = createDummyAssignments();
        List<TechStack> techStacks = createDummyTechStacks();
        ResultsData resultsData = createDummyResults(students, trainers, assignments);

        // Calculate and display required data
        findHighestPerformingStudent(resultsData);
        findSecondHighestStudent(resultsData);
        findOverallRanking(resultsData);
        getStudentsNeedingImprovements(resultsData);
        getResultsForStudent("Rohan", resultsData);
        getAllStudentsResults(resultsData);
    }

    private static List<Student> createDummyStudents() {
        List<Student> students = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            students.add(new Student("S00" + i, "Student " + i, "student" + i + "@example.com", "123456789" + i));
        }
        return students;
    }

    private static List<Trainer> createDummyTrainers() {
        List<Trainer> trainers = new ArrayList<>();
        for (int i = 1; i <= 3; i++) {
            trainers.add(new Trainer("T00" + i, "Trainer " + i, "trainer" + i + "@example.com", "987654321" + i, createDummyTechStacks()));
        }
        return trainers;
    }

    private static List<Assignment> createDummyAssignments() {
        List<Assignment> assignments = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            List<Question> questions = new ArrayList<>();
            for (int j = 1; j <= 3; j++) {
                questions.add(new Question("Q00" + j, List.of("A", "B", "C"), "A", 10, "TS00" + i, "A00" + i));
            }
            assignments.add(new Assignment("A00" + i, "Assignment " + i, "Description for assignment " + i, "2024-09-0" + i, questions));
        }
        return assignments;
    }

    private static List<TechStack> createDummyTechStacks() {
        List<TechStack> techStacks = new ArrayList<>();
        techStacks.add(new TechStack("TS001", "Java", "Java programming language"));
        techStacks.add(new TechStack("TS002", "Python", "Python programming language"));
        return techStacks;
    }

    private static ResultsData createDummyResults(List<Student> students, List<Trainer> trainers, List<Assignment> assignments) {
        ResultsData resultsData = new ResultsData();
        for (Student student : students) {
            for (Assignment assignment : assignments) {
                int score = (int) (Math.random() * 100);
                String feedback = score >= 50 ? "Good job!" : "Needs improvement";
                resultsData.addResult(new Result("R00" + (resultsData.getAllResults().size() + 1), student, assignment, trainers.get((int) (Math.random() * trainers.size())), score, feedback, "2024-08-20"));
            }
        }
        return resultsData;
    }

    private static void findHighestPerformingStudent(ResultsData resultsData) {
        Result highestResult = resultsData.getAllResults().stream()
                .max(Comparator.comparingInt(Result::getScore))
                .orElse(null);
        if (highestResult != null) {
            System.out.println("Highest Performing Student: " + highestResult.getStudent().getName() + " with score: " + highestResult.getScore());
        }
    }

    private static void findSecondHighestStudent(ResultsData resultsData) {
        List<Result> sortedResults = new ArrayList<>(resultsData.getAllResults());
        sortedResults.sort(Comparator.comparingInt(Result::getScore).reversed());
        if (sortedResults.size() > 1) {
            Result secondHighestResult = sortedResults.get(1);
            System.out.println("Second Highest Student: " + secondHighestResult.getStudent().getName() + " with score: " + secondHighestResult.getScore());
        }
    }

    private static void findOverallRanking(ResultsData resultsData) {
        Map<Student, Integer> studentScores = new HashMap<>();
        for (Result result : resultsData.getAllResults()) {
            studentScores.put(result.getStudent(), studentScores.getOrDefault(result.getStudent(), 0) + result.getScore());
        }

        List<Student> rankedStudents = new ArrayList<>(studentScores.keySet());
        rankedStudents.sort((s1, s2) -> studentScores.get(s2).compareTo(studentScores.get(s1)));

        System.out.println("Overall Ranking of Students:");
        for (Student student : rankedStudents) {
            System.out.println(student.getName() + ": " + studentScores.get(student));
        }
    }

    private static void getStudentsNeedingImprovements(ResultsData resultsData) {
        System.out.println("Students Needing Improvement:");
        for (Result result : resultsData.getAllResults()) {
            if (result.getScore() < 50) {
                System.out.println(result.getStudent().getName() + " scored " + result.getScore() + ". Feedback: " + result.getFeedback());
            }
        }
    }

    private static void getResultsForStudent(String studentName, ResultsData resultsData) {
        System.out.println("Results for " + studentName + ":");
        for (Result result : resultsData.getResultsByStudent(new Student("", studentName, "", ""))) {
            System.out.println("Assignment: " + result.getAssignment().getTitle() + ", Score: " + result.getScore() + ", Feedback: " + result.getFeedback());
        }
    }

    private static void getAllStudentsResults(ResultsData resultsData) {
        System.out.println("All Students Results:");
        for (Result result : resultsData.getAllResults()) {
            System.out.println("Student: " + result.getStudent().getName() + ", Assignment: " + result.getAssignment().getTitle() + ", Score: " + result.getScore() + ", Trainer: " + result.getTrainer().getName());
        }
    }
}
