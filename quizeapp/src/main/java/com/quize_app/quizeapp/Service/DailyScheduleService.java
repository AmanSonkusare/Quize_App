package com.quize_app.quizeapp.Service;

import com.quize_app.quizeapp.Repositary.DailySchedulerRepo;
import com.quize_app.quizeapp.model.DailySchedule;
import com.quize_app.quizeapp.model.WeeklyScheduler;
import com.quize_app.quizeapp.utils.RandomDateGenerater;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;


@Service
public class DailyScheduleService {

    @Autowired
    private DailySchedulerRepo repo;

    @Autowired
    private WeeklyScheduleService weeklyScheduleService;

    public void svaeDailySchedule(DailySchedule ds) {
        System.out.println(ds);
        repo.save(ds);
    }

public Optional<DailySchedule> getDailyForWeek(int id){
        return repo.findById(id);
}

public List<DailySchedule> getAllData(){
        return repo.findAll();
}

public void deleteById(int id){
        repo.deleteById(id);
}

public List<DailySchedule> saveDailyRecordInList(int weekid,int value){
        List<DailySchedule> list=new ArrayList<>();
        Optional<WeeklyScheduler> week_id=weeklyScheduleService.weeklyDataById(weekid);
        for(int i=0;i<value;i++){
            DailySchedule dailySchedule=DailySchedule.builder()
                    .dayNumber(i)
                    .title("java basic day" + i)
                    .description("day wise topic are given")
                    .courseTopic("java")
                    .category("learing")
                    .isActive(true)
                    .creatDate(RandomDateGenerater.createDate())
                    .creatBy("Bootcoding")
                    .modifiedDate(RandomDateGenerater.modifiedDate())
                    .modifiedBy("Bootcoding")
                    .weeklyScheduler(week_id.get())
                    .build();
            list.add(dailySchedule);
        }
        repo.saveAll(list);
        return list;
}

public List<DailySchedule> findByWeekId(int weekId){
        return repo.findByweeklySchedulerId(weekId);
}

}
