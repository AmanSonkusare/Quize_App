package com.quize_app.quizeapp.Service;

import com.quize_app.quizeapp.Repositary.WeeklySchedulerRepo;
import com.quize_app.quizeapp.model.WeeklyScheduler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeeklyScheduleService {
    @Autowired
    private WeeklySchedulerRepo wsrepo;

    public void saveWeekly(WeeklyScheduler w) {
        System.out.println(w);
        wsrepo.save(w);
    }
}
