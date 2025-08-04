package com.samjsddevelopment.restapitemplate.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.samjsddevelopment.restapitemplate.dto.ParentRequest;
import com.samjsddevelopment.restapitemplate.dto.ParentResponse;
import com.samjsddevelopment.restapitemplate.service.ParentService;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/parents")
public class ParentController {

    private final ParentService service;

    @PostMapping
    public ParentResponse createParent(@RequestBody ParentRequest request) {
        return service.createParent(request);
    }

}
