
package com.automation.personal_agent.controller;

import com.automation.personal_agent.model.JobApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JobApplicationController {

    @GetMapping("/api/jobs")
    public JobApplication getJob() {
        return new JobApplication(
            "Google",
            "Java Backend Intern",
            "Applied"
        );
    }
}