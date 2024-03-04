package com.example.cicd.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * Created by KimKyungHo on 2024-03-04(004)
 */

@Service
public class TestServiceImpl implements TestService {

    @Override
    public String getTestString() {
        return "okay";
    }

}
