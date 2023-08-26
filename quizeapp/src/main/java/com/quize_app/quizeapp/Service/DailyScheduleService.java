package com.quize_app.quizeapp.Service;

import com.quize_app.quizeapp.Repositary.DailySchedulerRepo;
import com.quize_app.quizeapp.model.DailySchedule;
import com.quize_app.quizeapp.model.WeeklyScheduler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class DailyScheduleService {

    @Autowired
    private DailySchedulerRepo repo;

    public void svaeDailySchedule(DailySchedule ds) {
        System.out.println(ds);
        repo.save(ds);
    }

//public List<DailySchedule> getDailyForWeek(int id){
//        return repo.findByWeeklyId(id);
//}


}
