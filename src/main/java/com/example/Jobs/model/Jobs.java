package com.example.Jobs.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Jobs")
public class Jobs {
    @Id

    private Long id;
    private String title;
    private String description;
    private String location;
    private Double salary;

    private String companyName;
    private String employerName;
    private JobType jobType;
    private LocalDate appliedDate;


}
