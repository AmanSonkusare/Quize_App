package com.quize_app.quizeapp.Repositary;

import com.quize_app.quizeapp.model.WeeklyScheduler;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WeeklySchedulerRepo extends JpaRepository<WeeklyScheduler, Integer> {
}
