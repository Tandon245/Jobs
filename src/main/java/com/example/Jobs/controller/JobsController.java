package com.example.Jobs.controller;

import com.example.Jobs.model.JobType;
import com.example.Jobs.model.Jobs;
import com.example.Jobs.service.JobsService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/jobs")
public class JobsController {
    @Autowired
    private JobsService service;

    @PostMapping("/addJob")
    public ResponseEntity<String> addJob(@RequestBody @Valid Jobs jobs) {


        return new ResponseEntity<>("job saved successfully with id " +service.addJobs(jobs), HttpStatus.CREATED);
    }

    @GetMapping("/getAllJobs")
    public List<Jobs> getAllJobs() {
        return service.getAllJobs();
    }

    @GetMapping("/getJobById/{id}")
    public ResponseEntity<String> getJobById(@PathVariable Long id) {
        if (service.getJobById(id) != null) {
            return new ResponseEntity<>(service.getJobById(id).toString(), HttpStatus.FOUND);
        }
        return new ResponseEntity<>("There is no such job with id " + id + " in the database", HttpStatus.BAD_REQUEST);
    }


    @DeleteMapping("deleteJobById/{id}")
    public ResponseEntity<String> deleteJobById(@PathVariable Long id) {
        if (service.deleteJobById(id) != null) {
            service.deleteJobById(id);
            return new ResponseEntity<>("Job with id " + id + " deleted successfully", HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>("No such job exist in the database with id " + id, HttpStatus.BAD_REQUEST);
    }

    @GetMapping("/getJobByJobType/{jobType}")
    public List<Jobs> getJobByJobType(@PathVariable String jobType) {
        JobType type = JobType.valueOf(jobType.toUpperCase());
        return service.getJobByJobType(type);
    }


}
