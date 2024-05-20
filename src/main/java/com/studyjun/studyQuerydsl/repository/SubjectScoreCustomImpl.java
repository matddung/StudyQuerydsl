package com.studyjun.studyQuerydsl.repository;

import com.querydsl.core.Tuple;
import com.querydsl.jpa.impl.JPAQuery;
import com.querydsl.jpa.impl.JPAQueryFactory;
import com.studyjun.studyQuerydsl.controller.dto.SubjectScoreResponse;
import com.studyjun.studyQuerydsl.entity.QScore;
import com.studyjun.studyQuerydsl.entity.QStudent;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class SubjectScoreCustomImpl implements SubjectScoreCustom{

    private final JPAQueryFactory jpaQueryFactory;

    @Override
    public List<SubjectScoreResponse> findScoresByStudent(Long studentId) {
        QStudent st = QStudent.student;
        QScore sc = QScore.score1;

        JPAQuery<Tuple> query = jpaQueryFactory.select(st.id, st.name, st.age, sc.subject, sc.score)
                .from(st)
                .join(sc)
                .on(st.id.eq(sc.studentId))
                .where(st.id.eq(studentId))
                .orderBy(st.id.desc());

        return query.fetchJoin().fetch().stream().map(tuple -> SubjectScoreResponse.builder()
                .studentId(tuple.get(st.id))
                .name(tuple.get(st.name))
                .age(tuple.get(st.age))
                .subject(tuple.get(sc.subject))
                .score(tuple.get(sc.score))
                .build()).toList();
    }
}
