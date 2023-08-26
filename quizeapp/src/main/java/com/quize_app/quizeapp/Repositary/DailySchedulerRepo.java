package com.quize_app.quizeapp.Repositary;

import com.quize_app.quizeapp.model.DailySchedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface DailySchedulerRepo extends JpaRepository<DailySchedule, Integer> {
 //public List<DailySchedule> findByWeeklyId(int weeklyId);
}
