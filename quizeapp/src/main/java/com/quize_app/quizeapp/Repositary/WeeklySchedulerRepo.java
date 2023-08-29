package com.quize_app.quizeapp.Repositary;

import com.quize_app.quizeapp.model.DailySchedule;
import com.quize_app.quizeapp.model.WeeklyScheduler;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface WeeklySchedulerRepo extends JpaRepository<WeeklyScheduler, Integer> {
//    @Query("SELECT w.id,w.week_number,d.id FROM weekly_scheduler w JOIN daily_scheduler dON w.id= id")
//    public List<DailySchedule> gatAll(@Param("id") int id);
    public List<WeeklyScheduler> findBycourseid(int id);

 //@Query("SELECT w.id,w.week_number,d.id FROM weekly_scheduler w JOIN daily_schedule d ON  w.id=:n  where w.id =d.week_schedular_id ")
//public Optional<WeeklyScheduler> getAllDailyDataByWeeklyId(int n);



    //public WeeklyScheduler weekDataById(int id);
}
