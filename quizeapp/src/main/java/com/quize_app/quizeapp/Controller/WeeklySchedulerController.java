package com.quize_app.quizeapp.Controller;

import com.quize_app.quizeapp.Service.WeeklyScheduleService;
import com.quize_app.quizeapp.model.WeeklyScheduler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/weekly")
public class WeeklySchedulerController {
    @Autowired
    private WeeklyScheduleService service;

    @PostMapping("/week")
    public String saveWeek(@RequestBody WeeklyScheduler week){
       service.saveWeekly(week);
       return "weekly record save successfully";
    }
}
