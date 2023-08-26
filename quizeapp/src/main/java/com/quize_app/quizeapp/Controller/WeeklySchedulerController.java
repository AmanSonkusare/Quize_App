package com.quize_app.quizeapp.Controller;

import com.quize_app.quizeapp.Service.WeeklyScheduleService;
import com.quize_app.quizeapp.model.DailySchedule;
import com.quize_app.quizeapp.model.WeeklyScheduler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/weeklyscheduler")
public class WeeklySchedulerController {
    @Autowired
    private WeeklyScheduleService service;


    @PostMapping("/week")
    public String saveWeek(@RequestBody WeeklyScheduler week) {
        service.saveWeekly(week);
        return "weekly record save successfully";
    }

    @PostMapping("/weeklydata")
    public String WeeklyRandomData(@RequestParam("value") int value, @RequestParam("courseid") int courseId) {
        int courseid = service.weeklyDataGenerate(value, courseId);
        return "weekly data save successfully" + courseid;
    }

    @GetMapping("/week/{id}")
    public Optional<WeeklyScheduler> getByWeekly(@PathVariable int id) {
        return service.getByWeek(id);
    }

    @GetMapping("/week")
    public List<WeeklyScheduler> getAll() {
        List<WeeklyScheduler> d = service.getAllData();
        return d;
    }

    @DeleteMapping("/week/{id}")
    public void weeklyDataDelete(@PathVariable int id) {
        service.deleteWeeklyData(id);
    }

    @PutMapping("/week/{id}")
    public Optional<WeeklyScheduler> updateById( @RequestBody WeeklyScheduler w,@PathVariable int id) {
       return service.updateById(w,id);
    }

    @GetMapping("/weklydata/{id}")
    public Optional<WeeklyScheduler> getWeekDataById(@PathVariable int id) {
        return service.weeklyDataById(id);
    }


}
