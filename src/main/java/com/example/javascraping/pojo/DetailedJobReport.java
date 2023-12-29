package com.example.javascraping.pojo;

import com.example.javascraping.entity.Job;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DetailedJobReport {

    private List<Job> jobList;

}
