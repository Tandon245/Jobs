package com.example.Jobs.repository;

import com.example.Jobs.model.JobType;
import com.example.Jobs.model.Jobs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IJobsRepository extends JpaRepository<Jobs,Long> {

    @Query("select j from Jobs j where j.jobType =:n")
    public List<Jobs> getJobByJobType(@Param("n") JobType jobType);

}
