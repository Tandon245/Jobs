package com.example.Jobs.service;

import com.example.Jobs.model.Jobs;
import com.example.Jobs.repository.IJobsRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class JobsService {
    @Autowired
    private IJobsRepository repository;

    public Jobs addJobs(Jobs jobs) {
        repository.save(jobs);
        return jobs;
    }

}
