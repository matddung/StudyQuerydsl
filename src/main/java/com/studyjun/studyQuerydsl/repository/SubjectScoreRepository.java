package com.studyjun.studyQuerydsl.repository;

import com.studyjun.studyQuerydsl.entity.Score;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectScoreRepository extends JpaRepository<Score, Long>, SubjectScoreCustom {
}
