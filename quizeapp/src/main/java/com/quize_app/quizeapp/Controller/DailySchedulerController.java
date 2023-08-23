package com.quize_app.quizeapp.Controller;

import com.quize_app.quizeapp.Service.DailyScheduleService;
import com.quize_app.quizeapp.model.DailySchedule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dailyschedule")
public class DailySchedulerController {

    @Autowired
    private DailyScheduleService service;

    @PostMapping("/daily")
    public String saveDailySchedule(@RequestBody DailySchedule ds){
       service.svaeDailySchedule(ds);
       return "Daily record save successfully";
    }
}
