package org.mapleleaf.backend.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.mapleleaf.backend.dto.Problem;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Api(value = "[문제 상세정보 페이지]")
@RequestMapping("/api/v1")
@RestController
public class ProblemController {
    private static final Logger logger = LoggerFactory.getLogger(ProblemController.class);


    @ApiOperation(value="특정 problem정보")
    @GetMapping("/problem/{id}")
    Problem one(@PathVariable Long id) {
        logger.info("problems one: " + id);
        return new Problem();
    }
}
