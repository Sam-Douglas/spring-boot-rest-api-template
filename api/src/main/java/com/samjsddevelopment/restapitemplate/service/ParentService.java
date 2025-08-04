package com.samjsddevelopment.restapitemplate.service;

import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;

import com.samjsddevelopment.restapitemplate.dto.ParentRequest;
import com.samjsddevelopment.restapitemplate.dto.ParentResponse;
import com.samjsddevelopment.restapitemplate.mapper.ParentMapper;
import com.samjsddevelopment.restapitemplate.repository.ParentRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ParentService {
    
    private final ParentRepository repository;
    private final ParentMapper parentMapper = Mappers.getMapper(ParentMapper.class);

    public ParentResponse createParent(ParentRequest request) {
        var parent = parentMapper.parentRequestToParent(request);
        var saved = repository.saveAndFlush(parent);
        return parentMapper.parentToParentResponse(saved);
    }
}
