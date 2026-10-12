package com.automation.personal_agent.controller;

import com.automation.personal_agent.model.JobApplication;
import com.automation.personal_agent.service.JobApplicationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JobApplicationController {

    private final JobApplicationService jobApplicationService;

    public JobApplicationController(JobApplicationService jobApplicationService) {
        this.jobApplicationService = jobApplicationService;
    }

    @GetMapping("/api/jobs")
    public JobApplication getJob() {
        return jobApplicationService.getJobApplication();
    }
}