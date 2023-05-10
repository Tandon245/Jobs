package com.example.Jobs.service;

import com.example.Jobs.model.Jobs;
import com.example.Jobs.repository.IJobsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class JobsService {
    @Autowired
    private IJobsRepository repository;

    public Long addJobs(Jobs jobs) {

        Jobs newJob=new Jobs();
        newJob.setAppliedDate(LocalDate.now());
        newJob.setDescription(jobs.getDescription());
        newJob.setJobType(jobs.getJobType());
        newJob.setSalary(jobs.getSalary());
        newJob.setTitle(jobs.getTitle());
        newJob.setCompanyName(jobs.getCompanyName());
        newJob.setEmployerName(jobs.getEmployerName());
        newJob.setLocation(jobs.getLocation());
        repository.save(newJob);

        return newJob.getId();
    }

    public List<Jobs> getAllJobs(){
        return repository.findAll();
    }

    public Jobs getJobById(Long id){
        if(repository.findById(id).isPresent()){
            return repository.findById(id).get();
        }
        return null;
    }


    public  String deleteJobById(Long id){
        if(repository.findById(id).isPresent()){
            repository.deleteById(id);
            return "deleted";
        }
        return null;
    }

}
