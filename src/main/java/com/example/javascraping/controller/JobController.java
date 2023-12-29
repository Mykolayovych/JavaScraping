package com.example.javascraping.controller;

import com.example.javascraping.pojo.DetailedJobReport;
import com.example.javascraping.pojo.PreviewJobReport;
import com.example.javascraping.service.JobService;
import com.example.javascraping.service.PreviewJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JobController {

    @Autowired
    private PreviewJobService previewJobService;

    @Autowired
    private JobService jobService;

    @GetMapping("/detailed-jobs")
    public DetailedJobReport retrieveDetailedJobsInfoBy(@RequestParam("function") String jobFunction) {
        return jobService.retrieveDetailedJobsInfoBy(jobFunction);
    }

    @GetMapping("/minimized-jobs")
    public PreviewJobReport retrieveMinimizedJobsInfoBy(@RequestParam("function") String jobFunction) {
        return previewJobService.retrieveMinimizedJobsInfoBy(jobFunction);
    }

}
