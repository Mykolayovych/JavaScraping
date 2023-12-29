package com.example.javascraping.service;

import com.example.javascraping.pojo.DetailedJobReport;

public interface JobService {

    DetailedJobReport retrieveDetailedJobsInfoBy(String jobFunction);

}
