package com.quize_app.quizeapp.Controller;

import com.quize_app.quizeapp.Service.DailyScheduleService;
import com.quize_app.quizeapp.model.DailySchedule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/dailyschedule")
public class DailySchedulerController {

    @Autowired
    private DailyScheduleService service;

    @PostMapping("/daily")
    public String saveDailySchedule(@RequestBody DailySchedule ds) {
        service.svaeDailySchedule(ds);
        return "Daily record save successfully";
    }

    @GetMapping("/daily/{id}")
    public Optional<DailySchedule> getDailyForWeek(@PathVariable int id) {
        Optional<DailySchedule> d = service.getDailyForWeek(id);
        return d;
    }
    @GetMapping("/daily")
    public List<DailySchedule> getAllData(){
        return service.getAllData();
    }

    @DeleteMapping("/daily/{id}")
    public void deleteAllData(@PathVariable int id){
        service.deleteById(id);
    }
    @PostMapping("/dailyschedulerbyid/{weekid}/{value}")
    public List<DailySchedule> generateDaiilySchedularData(@PathVariable("weekid") int weekid ,@PathVariable ("value") int value){
        return service.saveDailyRecordInList(weekid,value);
    }

    @GetMapping("/findbyweekid/{weekid}")
    public List<DailySchedule> findByWeekSchedularId(@PathVariable int weekid)
    {
        return service.findByWeekId(weekid);
    }

//    @PutMapping("/daily/{id}")
//    public void updateDailyRecord(@RequestBody DailySchedule dailySchedule,@PathVariable int id){
//
//    }
}
