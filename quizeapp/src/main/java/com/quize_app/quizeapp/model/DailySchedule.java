package com.quize_app.quizeapp.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "daily_scheduler")
public class DailySchedule {
    @Id
    @GeneratedValue
    private int id;
    @Column(name = "weekly_id")
    private int weeklyid;
    @Column(name = "day_number")
    private int dayNumber;
    private String title;
    private String description;
    @Column(name = "course_topic")
    private String courseTopic;
    private String category;
    private boolean isActive;
    private Date CreatDate;
    private String creatBy;
    private Date modifiedDate;
    private String modifiedBy;


}

