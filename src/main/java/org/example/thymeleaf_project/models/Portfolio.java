package org.example.thymeleaf_project.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor

public class Portfolio {
    private String name;
    private String image;
    private String description;
}
