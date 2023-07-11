package com.mindex.challenge.controller;

import com.mindex.challenge.data.Compensation;
import com.mindex.challenge.service.CompensationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CompensationController {

    private static final Logger LOG = LoggerFactory.getLogger(EmployeeController.class);

    @Autowired
    private CompensationService compensationService;

    @GetMapping("/compensation/{id}")
    public Compensation read(@PathVariable String id) {
        LOG.debug("Received compensation get request for id [{}]", id);

        return compensationService.read(id);
    }

    @PutMapping("/compensation/{id}")
    public Compensation update(@PathVariable String id) {
        LOG.debug("Received compensation update request for id [{}]", id);

        return compensationService.update(id);
    }
}
