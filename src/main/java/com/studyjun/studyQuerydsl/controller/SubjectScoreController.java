package com.studyjun.studyQuerydsl.controller;

import com.studyjun.studyQuerydsl.controller.dto.SubjectScoreResponse;
import com.studyjun.studyQuerydsl.service.SubjectScoreService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/subject")
@RequiredArgsConstructor
public class SubjectScoreController {
    private final SubjectScoreService subjectScoreService;

    @GetMapping(value="/score/{studentId}")
    public ResponseEntity<List<SubjectScoreResponse>> getScoresByStudent (@PathVariable Long studentId) {
        List<SubjectScoreResponse> subjectSocreList = subjectScoreService.findScoresByStudent(studentId);
        return ResponseEntity.ok(subjectSocreList);
    }
}