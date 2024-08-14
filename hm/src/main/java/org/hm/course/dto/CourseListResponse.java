package org.hm.course.dto;

import lombok.Getter;

@Getter
public class CourseListResponse {
    private Long courseId;        // 강의 ID
    private String startDate;     // 수강일
    private String title;         // 강의 제목
    private String description;   // 강의 설명

    public CourseListResponse(Long courseId, String startDate, String title, String description) {
        this.courseId = courseId;
        this.startDate = startDate;
        this.title = title;
        this.description = description;
    }
}