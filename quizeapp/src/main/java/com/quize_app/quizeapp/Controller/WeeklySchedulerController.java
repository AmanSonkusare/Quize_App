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


    @PostMapping("/weeklydata/{value}")
    public String WeeklyRandomData(@PathVariable int value , @RequestBody WeeklyScheduler weeklyScheduler) {
        int courseid=weeklyScheduler.getCourseid();
        System.out.println(courseid);
        int cou_id = service.weeklyDataGenerate(value, courseid);
        return "weekly data save successfully" + cou_id;
    }


    @GetMapping("/week/{id}")
    public Optional<WeeklyScheduler> getByWeekly(@PathVariable int id) {
        return service.getByWeek(id);
    }

    @GetMapping("/course/{courseId}")
    public List<WeeklyScheduler> getByCourseId(@PathVariable int courseId){
        return service.getByCourseId(courseId);
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
