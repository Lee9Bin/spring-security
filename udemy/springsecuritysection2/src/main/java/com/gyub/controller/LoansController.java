package com.gyub.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoansController {

    @GetMapping("/myLoans")
    public String getLoanDetails() {
        return "대출 내역 입니다.";
    }

}
