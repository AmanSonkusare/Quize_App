package com.quize_app.quizeapp.Service;

import com.quize_app.quizeapp.Repositary.DailySchedulerRepo;
import com.quize_app.quizeapp.Repositary.WeeklySchedulerRepo;
import com.quize_app.quizeapp.model.DailySchedule;
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
            DailySchedule dailySchedule=new DailySchedule();
           ;
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
                    //.dailySchedules()
                    .build();
            list.add(week);
        }
        wsrepo.saveAll(list);
        return courseId;
    }

    public List<WeeklyScheduler> getByCourseId(int id) {

        return wsrepo.findBycourseid(id);
    }

    public void deleteWeeklyData(int id) {
        wsrepo.deleteById(id);

    }

    public Optional<WeeklyScheduler> updateById(WeeklyScheduler weeklyScheduler, int id) {
        Optional<WeeklyScheduler> weekid = wsrepo.findById(id);
        if (weekid != null)
            wsrepo.save(weeklyScheduler);
        return weekid;
    }

    public Optional<WeeklyScheduler> weeklyDataById(int id) {
        return wsrepo.findById(id);
    }

    public void weeklyAndDailyDataGenerate(int courseId)
    {
        List<DailySchedule> list=new ArrayList<>();
        for(int j=0;j<5;j++){
        DailySchedule d = DailySchedule.builder()
                .dayNumber(1)
                .title(RandomTitle.courseTitle())
                .description(null)
                .courseTopic("Spring Boot")
                .category("Java")
                .isActive(true)
                .creatDate(RandomDateGenerater.createDate())
                .creatBy("Bootcoding")
                .modifiedBy("BootCcoding")
                .modifiedDate(RandomDateGenerater.modifiedDate())
                .build();
        list.add(d);
    }

        //List<DailySchedule> ds=new ArrayList<>();

        //ds.add(dss.saveDailyRecordInList(,5));
        int i=0;
        WeeklyScheduler w= WeeklyScheduler.builder()
                .courseid(courseId)
                .weeknumber(i + 1)
                .title(RandomTitle.courseTitle())
                .description(null)
                .level(Randomlevel.randomLevel())
                .difficulty(RandomDifficulty.randomDifficulty())
                .isActive(true)
                .createdDate(null)
                .createdBy("Bootcoding")
                .modifiedDate(null)
                .modifiedBy("Bootcoding")
                .dailySchedules(list)
                .build();
        wsrepo.save(w);
    }


}
