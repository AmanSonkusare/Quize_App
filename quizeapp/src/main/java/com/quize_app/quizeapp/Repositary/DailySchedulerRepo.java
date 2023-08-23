package com.quize_app.quizeapp.Repositary;

import com.quize_app.quizeapp.model.DailySchedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DailySchedulerRepo extends JpaRepository<DailySchedule, Integer> {
}
