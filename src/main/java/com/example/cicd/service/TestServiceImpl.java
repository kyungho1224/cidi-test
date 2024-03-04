package com.example.cicd.service;

import lombok.RequiredArgsConstructor;

/**
 * Created by KimKyungHo on 2024-03-04(004)
 */

@RequiredArgsConstructor
public class TestServiceImpl implements TestService {

    @Override
    public String getTestString() {
        return "okay";
    }

}
