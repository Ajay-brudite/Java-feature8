package com.example;

import java.util.Objects;

public class TechStack {
    private String techStackId;
    private String name;
    private String description;

    public TechStack(String techStackId, String name, String description) {
        this.techStackId = techStackId;
        this.name = name;
        this.description = description;
    }

    // Getters and Setters
    public String getTechStackId() { return techStackId; }
    public String getName() { return name; }
    public String getDescription() { return description; }

    @Override
    public int hashCode() {
        return Objects.hash(techStackId);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        TechStack techStack = (TechStack) obj;
        return Objects.equals(techStackId, techStack.techStackId);
    }
}
