package org.hm.paymenthistory.controller;

import org.hm.paymenthistory.dto.PaymentDetailResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PaymentHistoryController {


    @GetMapping(value = "/payment-detail.hm")
    public String getPaymentDetailPage(Model model) {
        PaymentDetailResponse paymentDetail = new PaymentDetailResponse(
                1L,
                "국어",
                50000.0,
                "2024-09-01",
                "오전 10:00 ~ 12:00"
        );
        model.addAttribute("paymentDetail", paymentDetail);
        return "flone/payment-detail";
    }
}
