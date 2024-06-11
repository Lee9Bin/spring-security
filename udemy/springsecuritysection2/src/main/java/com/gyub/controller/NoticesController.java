package com.gyub.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoticesController {

    @GetMapping("/notices")
    public String getNotices() {
        return "공지사항 입니다.";
    }

}