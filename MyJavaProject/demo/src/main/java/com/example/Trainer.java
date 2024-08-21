package com.example;

import java.util.List;
import java.util.Objects;

public class Trainer {
    private String trainerId;
    private String name;
    private String email;
    private String contactNumber;
    private List<TechStack> techStacks;

    public Trainer(String trainerId, String name, String email, String contactNumber, List<TechStack> techStacks) {
        this.trainerId = trainerId;
        this.name = name;
        this.email = email;
        this.contactNumber = contactNumber;
        this.techStacks = techStacks;
    }

    // Getters and Setters
    public String getTrainerId() { return trainerId; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getContactNumber() { return contactNumber; }
    public List<TechStack> getTechStacks() { return techStacks; }

    @Override
    public int hashCode() {
        return Objects.hash(trainerId);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Trainer trainer = (Trainer) obj;
        return Objects.equals(trainerId, trainer.trainerId);
    }
}
