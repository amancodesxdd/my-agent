package com.automation.personal_agent.service;

import com.automation.personal_agent.model.JobApplication;
import org.springframework.stereotype.Service;

@Service
public class JobApplicationService {

    public JobApplication getJobApplication() {
        return new JobApplication(
            "Google",
            "Java Backend Intern",
            "Applied"
        );
    }
}