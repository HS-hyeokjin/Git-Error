package org.hm.course.controller;

import org.hm.course.dto.CourseDetailResponse;
import org.hm.course.dto.CourseListResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CourseController {

    @GetMapping(value = "/course-detail.hm")
    public String getCourseDetailPage(Model model) {
        CourseDetailResponse course = new CourseDetailResponse(
                1L,
                "국어의 정석 ",
                50000.0,
                4.5,
                "국어 내용 국어 내용 국어 내용 국어 내용 국어 내용 국어 내용 ",
                "2024-09-01",
                "2024-12-31",
                "홍길동",
                30,
                25
        );

        model.addAttribute("course", course);

        return "flone/course-detail";
    }

    @GetMapping(value = "/course-register.hm")
    public String getCourseRegisterPage(Model model) {
        return "flone/course-register";
    }

    @GetMapping(value = "/course-list.hm")
    public String getCourseListPage(Model model) {
        List<CourseListResponse> courseList = new ArrayList();
        courseList.add(new CourseListResponse(1L, "2024-08-15", "국어의 정섟", "국어 내용국어 내용국어 내용국어 내용국어 내용국어 내용국어 내용국어 내용"));
        courseList.add(new CourseListResponse(2L, "2024-09-01", "수학의 정석", "수학 내수학 내용수학 내용수학 내용수학 내용수학 내용수학 내용수학 내용용"));
        courseList.add(new CourseListResponse(3L, "2024-09-15", "과학의 정석", "내용내용내용내용내용내용내용내용내용내용내용내용내용내용내용내용내용"));

        model.addAttribute("courses", courseList);

        return "flone/course-list";
    }
}
