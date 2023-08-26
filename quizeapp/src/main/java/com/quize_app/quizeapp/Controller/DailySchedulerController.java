package com.quize_app.quizeapp.Controller;

import com.quize_app.quizeapp.Service.DailyScheduleService;
import com.quize_app.quizeapp.model.DailySchedule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

//@GetMapping("/daily/{id}")
//    public ResponseEntity<List<DailySchedule>> getDailyForWeek(@PathVariable int id){
//List<DailySchedule> d=service.getDailyForWeek(id);
//return ResponseEntity.ok(d);
//}
}
