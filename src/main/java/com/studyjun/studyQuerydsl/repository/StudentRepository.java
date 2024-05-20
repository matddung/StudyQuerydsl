package com.studyjun.studyQuerydsl.repository;

import com.studyjun.studyQuerydsl.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}