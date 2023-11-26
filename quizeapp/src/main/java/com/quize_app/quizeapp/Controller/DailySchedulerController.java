package com.quize_app.quizeapp.Controller;

import com.quize_app.quizeapp.Service.DailyScheduleService;
import com.quize_app.quizeapp.model.DailySchedule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/dailyschedule")
public class DailySchedulerController implements ErrorController {

    @Autowired
    private DailyScheduleService service;

    //data post by postman
    @PostMapping("/daily")
    public String saveDailySchedule(@RequestBody DailySchedule ds) {
        service.svaeDailySchedule(ds);
        return "Daily record save successfully";
    }

    //get data by id
    @GetMapping("/daily/{id}")
    public Optional<DailySchedule> getDailyForWeek(@PathVariable int id) {
        Optional<DailySchedule> d = service.getDailyForWeek(id);
        return d;
    }

    //get all data
    @GetMapping("/daily")
    public List<DailySchedule> getAllData(){
        return service.getAllData();
    }

    // delete data by id
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

    // update data by id
    @PutMapping("/daily/{id}")
    public void updateDailyRecord(@RequestBody DailySchedule dailySchedule,@PathVariable int id){
        service.updateById(dailySchedule,id);
    }
}
