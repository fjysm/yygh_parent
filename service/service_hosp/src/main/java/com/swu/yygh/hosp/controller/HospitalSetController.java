package com.swu.yygh.hosp.controller;

import com.swu.yygh.hosp.service.HospitalSetService;
import com.swu.yygh.hosp.service.impl.HospitalSetServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin/hosp/hospitalSet")
public class HospitalSetController {

    //注入service
    @Autowired
    private HospitalSetService hospitalSetService;
}
