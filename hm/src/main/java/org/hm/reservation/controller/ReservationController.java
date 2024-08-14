package org.hm.reservation.controller;

import org.hm.reservation.dto.ReservationListResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ReservationController {

    @GetMapping(value = "/reservation-list.hm")
    public String getReservationListPage(Model model) {
        List<ReservationListResponse> reservationList = new ArrayList();
        reservationList.add(new ReservationListResponse(1L, "국어의 정석", "2024-08-15", 150000.0, "결제 완료"));
        reservationList.add(new ReservationListResponse(2L, "수학의 정석", "2024-09-01", 200000.0, "결제 대기"));
        reservationList.add(new ReservationListResponse(3L, "과학의 정석", "2024-09-15", 180000.0, "결제 완료"));

        model.addAttribute("reservations", reservationList);

        return "flone/reservation-list";
    }
}
