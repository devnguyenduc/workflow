package com.group.workflow.controller;

import com.group.workflow.domain.ModelRequest;
import com.group.workflow.service.ModelRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ModelRequestController {

    @Autowired
    private ModelRequestService modelRequestService;

    @RequestMapping(value = "/model-requests", method = RequestMethod.GET)
    @ResponseBody
    List<ModelRequest> getAllModelRequest() {
        return modelRequestService.findAll();
    }

    @RequestMapping(value = "/model-request", method = RequestMethod.POST)
    @ResponseBody
    ModelRequest modelRequestGraph(@RequestParam("status") String status,
                                   @RequestBody ModelRequest modelRequest) {
        return modelRequestService.handleGraphService(status, modelRequest);
    }
}
