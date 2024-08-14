package org.hm.paymenthistory.dto;

import lombok.Getter;

@Getter
public class PaymentDetailResponse {

    private Long courseId;
    private String courseName;
    private Double price;
    private String startDate;
    private String courseTime;

    public PaymentDetailResponse(Long courseId, String courseName, Double price, String startDate, String courseTime) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.price = price;
        this.startDate = startDate;
        this.courseTime = courseTime;
    }
}