package com.gapple.weeingback.domain.diary.entity.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DiarySubmitRequest {
    private String title;

    private String description;

    private Long studentGrade;

    private Long studentClass;
}
