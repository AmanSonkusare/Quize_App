package com.quize_app.quizeapp.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.Set;

@Data
@Entity
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
    private Date CreatDate;
    private String creatBy;
    private Date modifiedDate;
    private String modifiedBy;

}

