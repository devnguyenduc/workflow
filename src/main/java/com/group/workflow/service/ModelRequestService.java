package com.group.workflow.service;

import com.group.workflow.domain.ModelRequest;
import com.group.workflow.repository.ModelRequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModelRequestService {

    @Autowired
    private ModelRequestRepository requestRepository;

    public List<ModelRequest> findAll() {
        return requestRepository.findAll();
    }

    public ModelRequest handleGraphService(String status, ModelRequest modelRequest) {
        if (status.equals("create")) {
            return requestRepository.save(modelRequest);
        }
        return null;
    }
}
