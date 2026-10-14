package com.automation.personal_agent.service;

import com.automation.personal_agent.model.JobApplication;
import com.automation.personal_agent.repository.JobApplicationRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class JobApplicationService {

    private final JobApplicationRepository repository;

    public JobApplicationService(JobApplicationRepository repository) {
        this.repository = repository;
    }

    public List<JobApplication> getAllJobApplications() {
        return repository.findAll();
    }
}