package com.example.cicd.controller;

import com.example.cicd.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by KimKyungHo on 2024-03-04(004)
 */

@RestController
@RequiredArgsConstructor
public class TestController {

    private final TestService testService;

    @GetMapping("/test")
    public String getTestString() {
        return testService.getTestString();
    }

}
