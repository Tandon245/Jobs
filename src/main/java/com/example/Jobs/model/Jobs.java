package com.example.Jobs.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @NotNull(message = "Title is mandatory")
    @Size(min = 3, max = 50, message = "Title must be between 3 and 50 characters")
    @Column(name = "title")
    private String title;

    @NotNull(message = "Description is mandatory")
    @Size(min = 10, max = 500, message = "Description must be between 10 and 500 characters")
    @Column(name = "description")
    private String description;
    @NotNull(message = "Location is mandatory")
    @Size(min = 3, max = 50, message = "Location must be between 3 and 50 characters")
    @Column(name = "location")
    private String location;
    @NotNull(message = "Salary is mandatory")
    @DecimalMin(value = "0.01", message = "Salary must be greater than 0")
    @DecimalMax(value = "1000000.00", message = "Salary must be less than 1000000")
    @Column(name = "salary")
    private Double salary;
    @NotNull(message = "Company name is mandatory")
    @Size(min = 3, max = 50, message = "Company name must be between 3 and 50 characters")
    @Column(name = "company_name")
    private String companyName;
    @NotNull(message = "Employer name is mandatory")
    @Size(min = 3, max = 50, message = "Employer name must be between 3 and 50 characters")
    @Column(name = "employer_name")
    private String employerName;
    @NotNull(message = "Job type is mandatory")
    @Column(name = "job_type")
    @Enumerated(EnumType.STRING)
    private JobType jobType;
    @Column(name = "applied_date")
    private LocalDate appliedDate;


}
