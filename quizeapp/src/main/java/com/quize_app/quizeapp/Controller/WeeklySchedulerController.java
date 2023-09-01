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

//post data using postman
    @PostMapping("/week")
    public String saveWeek(@RequestBody WeeklyScheduler week) {
        service.saveWeekly(week);
        return "weekly record save successfully";
    }


    //post data through postman courseId and num of record entre through url
    @PostMapping("/weeklydata/{value}")
    public String WeeklyRandomData(@PathVariable int value , @RequestBody WeeklyScheduler weeklyScheduler) {
        int courseid=weeklyScheduler.getCourseid();
        System.out.println(courseid);
        int cou_id = service.weeklyDataGenerate(value, courseid);
        return "weekly data save successfully" + cou_id;
    }

// get data by id(Auto generated id)
    @GetMapping("/week/{id}")
    public Optional<WeeklyScheduler> getByWeekly(@PathVariable int id) {
        return service.getByWeek(id);
    }

//get data by courseid
    @GetMapping("/course/{courseId}")
    public List<WeeklyScheduler> getByCourseId(@PathVariable int courseId){
        return service.getByCourseId(courseId);
    }

//get all record
    @GetMapping("/week")
    public List<WeeklyScheduler> getAll() {
        List<WeeklyScheduler> d = service.getAllData();
        return d;
    }

    // delete record by id
    @DeleteMapping("/week/{id}")
    public void weeklyDataDelete(@PathVariable int id) {
        service.deleteWeeklyData(id);
    }

    //update record by id
    @PutMapping("/week/{id}")
    public Optional<WeeklyScheduler> updateById( @RequestBody WeeklyScheduler w,@PathVariable int id) {
       return service.updateById(w,id);
    }


   //post data daily and weekly in nested form

    @PostMapping("generaterecord/{courseId}")
    public void generateRecord(@PathVariable int courseId){
      service.weeklyAndDailyDataGenerate(courseId);
    }
}
