package com.studyjun.studyQuerydsl.repository;

import com.studyjun.studyQuerydsl.controller.dto.SubjectScoreResponse;

import java.util.List;

public interface SubjectScoreCustom {
    List<SubjectScoreResponse> findScoresByStudent(Long studentId);
}