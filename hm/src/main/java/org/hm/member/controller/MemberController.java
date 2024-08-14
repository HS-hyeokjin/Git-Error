package org.hm.member.controller;

import org.hm.member.dto.MyAccountResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {

    @GetMapping(value = "/login-register.hm")
    public String getMemberLoginPage(Model model) {
        return "flone/login-register";
    }

    @GetMapping(value = "/my-account.hm")
    public String getMyAccountPage(Model model) {
        MyAccountResponse myAccount = new MyAccountResponse(
                "example@example.com",
                "아쉬운거지",
                "password123",
                "010-1234-5678",
                "1990-01-01"
        );

        model.addAttribute("account", myAccount);

        return "flone/my-account";
    }

}
