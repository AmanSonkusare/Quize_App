package com.quize_app.quizeapp.Controller;

import com.quize_app.quizeapp.Service.CourseService;
import com.quize_app.quizeapp.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class CourseController {
    @Autowired
    private CourseService courseService;

//    @PostMapping("/course")
//    public String saveCourse(@RequestBody Course course){
//
//
//    }

}
