package cn.hust.controller;


import cn.hust.pojo.Course;
import cn.hust.service.CourseService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/account")
public class CourseController {
    @Autowired
    private CourseService courseService;


    @RequestMapping(value = "/findAllCourse",produces = "application/json; charset=utf-8")
    public @ResponseBody String findAllCourse() throws JsonProcessingException {
        System.out.println("表现层  查询所有的课程");
        List<Course> allCourse = courseService.findAllCourse();
        for(Course course:allCourse){
            System.out.println(course);
        }
       ;
        return  new ObjectMapper().writeValueAsString(allCourse);
    }
}
