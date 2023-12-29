package com.example.javascraping.pojo;

import com.example.javascraping.entity.PreviewJob;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
@Builder
public class PreviewJobReport {

    private int totalJobsCounter;

    private List<PreviewJob> previewJobList;

}
