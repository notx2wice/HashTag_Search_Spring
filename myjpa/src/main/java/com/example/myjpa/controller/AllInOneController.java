package com.example.myjpa.controller;

import com.example.myjpa.service.AllInOneService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

@ResponseBody
@Controller
@RequiredArgsConstructor
public class AllInOneController {
    final AllInOneService allInOneService;


}
