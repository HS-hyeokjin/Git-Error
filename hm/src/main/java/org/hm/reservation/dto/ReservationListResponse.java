package org.hm.reservation.dto;

import lombok.Getter;

@Getter
public class ReservationListResponse {
    private Long reservationId;  // 예약 ID
    private String courseName;   // 강의명
    private String courseStartDate; // 강의 시작일
    private Double price;        // 가격
    private String paymentStatus; // 결제 상태

    public ReservationListResponse(Long reservationId, String courseName, String courseStartDate, Double price, String paymentStatus) {
        this.reservationId = reservationId;
        this.courseName = courseName;
        this.courseStartDate = courseStartDate;
        this.price = price;
        this.paymentStatus = paymentStatus;
    }
}