package com.example.Jobs.repository;

import com.example.Jobs.model.Jobs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IJobsRepository extends JpaRepository<Jobs,Long> {

}
