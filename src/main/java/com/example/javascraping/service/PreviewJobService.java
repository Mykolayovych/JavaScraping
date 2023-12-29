package com.example.javascraping.service;

import com.example.javascraping.pojo.PreviewJobReport;

public interface PreviewJobService {

    PreviewJobReport retrieveMinimizedJobsInfoBy(String jobFunction);

}
