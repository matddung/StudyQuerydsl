package com.studyjun.studyQuerydsl.service;

import com.studyjun.studyQuerydsl.controller.dto.SubjectScoreResponse;
import com.studyjun.studyQuerydsl.repository.SubjectScoreRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SubjectScoreService {
    private final SubjectScoreRepository subjectScoreRepository;

    public List<SubjectScoreResponse> findScoresByStudent(Long studentId) {
        return subjectScoreRepository.findScoresByStudent(studentId);
    }
}