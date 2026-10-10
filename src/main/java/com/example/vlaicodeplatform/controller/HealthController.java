package com.example.vlaicodeplatform.controller;

import com.example.vlaicodeplatform.common.BaseResponse;
import com.example.vlaicodeplatform.common.ResultUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/health")
public class HealthController {
    @GetMapping
    public BaseResponse<String> healthCheck() {
        return ResultUtils.success("OK");
    }
}
