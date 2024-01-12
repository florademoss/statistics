package com.example.statistics.controller;

import com.example.statistics.service.ScoreServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;


@Controller
public class StatisticsController {
    @Autowired
    private ScoreServiceImpl scoreService;

    @RequestMapping(value = "/queryMedianByClass/{classid}" ,method = RequestMethod.GET)
    @ResponseBody
    public String queryMedianByClass(@PathVariable("classid") int classid){
        System.out.println("hello"+classid);
        scoreService.queryMedianByClass(classid);
        return "hello";
    }
    @RequestMapping("/queryAverageByClass")
    @ResponseBody
    public String queryAverageByClass(){
        return "hello";
    }
}
