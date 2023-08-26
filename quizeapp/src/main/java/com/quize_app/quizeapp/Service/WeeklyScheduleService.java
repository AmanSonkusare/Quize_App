package com.quize_app.quizeapp.Service;

import com.quize_app.quizeapp.Repositary.DailySchedulerRepo;
import com.quize_app.quizeapp.Repositary.WeeklySchedulerRepo;
import com.quize_app.quizeapp.model.WeeklyScheduler;
import com.quize_app.quizeapp.utils.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class WeeklyScheduleService {
    @Autowired
    private WeeklySchedulerRepo wsrepo;

    @Autowired
    private DailySchedulerRepo dailyrepo;

    public void saveWeekly(WeeklyScheduler w) {
//        System.out.println(w);
        wsrepo.save(w);
    }

    public Optional<WeeklyScheduler> getByWeek(int id) {
        //System.out.println(id);
//        for (int i = 0; i < getAllData().size(); i++) {
//            System.out.println(getAllData().get(i));
//        }
        return wsrepo.findById(id);

    }

    public List<WeeklyScheduler> getAllData() {
        List<WeeklyScheduler> week = wsrepo.findAll();
        return week;
    }

    public int weeklyDataGenerate(int value, int courseId) {

        List<WeeklyScheduler> list = new ArrayList<>();
        // int courseId=RandaomCourseId.courseId();//common value pass all row
        for (int i = 0; i < value; i++) {
            WeeklyScheduler week = WeeklyScheduler.builder()
                    .courseid(courseId)
                    .weeknumber(i + 1)
                    .title(RandomTitle.courseTitle())
                    .description(null)
                    .level(Randomlevel.randomLevel())
                    .difficulty(RandomDifficulty.randomDifficulty())
                    .isActive(true)
                    .createdDate(RandomDateGenerater.createDate())
                    .createdBy("Bootcoding")
                    .modifiedDate(RandomDateGenerater.modifiedDate())
                    .modifiedBy("Bootcoding")
                    .build();
            list.add(week);
        }
        wsrepo.saveAll(list);
        return courseId;
    }

    public void deleteWeeklyData(int id) {
        wsrepo.deleteById(id);

    }

    public Optional<WeeklyScheduler> updateById( WeeklyScheduler weeklyScheduler,int id) {
        Optional<WeeklyScheduler> weekid=wsrepo.findById(id);
        if(weekid != null)
        wsrepo.save(weeklyScheduler);
        return weekid;
    }

    public Optional<WeeklyScheduler> weeklyDataById(int id) {
       return wsrepo.findById(id);
    }

}
