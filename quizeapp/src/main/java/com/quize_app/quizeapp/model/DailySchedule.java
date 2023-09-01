package com.quize_app.quizeapp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.Set;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "daily_schedule")
public class DailySchedule {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private int id;
    @Column(name = "day_number")
    private int dayNumber;
    private String title;
    private String description;
    @Column(name = "course_topic")
    private String courseTopic;
    private String category;
    private Boolean isActive;
    private Date creatDate;
    private String creatBy;
    private Date modifiedDate;
    private String modifiedBy;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="week_schedular_id")
   private WeeklyScheduler weeklyScheduler;

}

