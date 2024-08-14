package org.hm.course.dto;

import lombok.Getter;

@Getter
public class CourseDetailResponse {
    private Long courseId;        // 강좌 ID
    private String courseName;    // 과목명
    private Double coursePrice;   // 강좌 가격
    private Double rating;        // 별점 (nullable)
    private String courseDescription; // 강좌 내용
    private String startDate;     // 강좌 시작일
    private String endDate;       // 강좌 종료일
    private String instructorName; // 강사명
    private int totalCapacity;    // 전체 인원
    private int currentEnrollment; // 현재 인원

    public CourseDetailResponse(Long courseId, String courseName, Double coursePrice, Double rating,
                                String courseDescription, String startDate, String endDate,
                                String instructorName, int totalCapacity, int currentEnrollment) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.coursePrice = coursePrice;
        this.rating = rating;
        this.courseDescription = courseDescription;
        this.startDate = startDate;
        this.endDate = endDate;
        this.instructorName = instructorName;
        this.totalCapacity = totalCapacity;
        this.currentEnrollment = currentEnrollment;
    }
}