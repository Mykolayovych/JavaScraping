package com.example.javascraping.repository;

import com.example.javascraping.entity.PreviewJob;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PreviewJobRepository extends JpaRepository<PreviewJob, Long> {
}
