package com.quize_app.quizeapp.Service;

import com.quize_app.quizeapp.Repositary.DailySchedulerRepo;
import com.quize_app.quizeapp.model.DailySchedule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DailyScheduleService {

    @Autowired
    private DailySchedulerRepo repo;

    public void svaeDailySchedule(DailySchedule ds) {
        repo.save(ds);
    }


}
