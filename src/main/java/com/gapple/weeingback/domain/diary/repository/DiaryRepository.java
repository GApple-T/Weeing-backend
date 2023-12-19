package com.gapple.weeingback.domain.diary.repository;

import com.gapple.weeingback.domain.diary.entity.Diary;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DiaryRepository extends JpaRepository<Diary, Long> {
    List<Diary> findAllByStudentGrade(Long studentGrade);
    List<Diary> findAllByStudentGradeAndStudentClass(Long studentGrade, Long studentClass);
}
