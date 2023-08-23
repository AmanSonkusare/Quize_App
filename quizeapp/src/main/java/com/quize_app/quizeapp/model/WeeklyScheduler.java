package com.quize_app.quizeapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;
@Data
@Entity
public class WeeklyScheduler {
    @Id
    @GeneratedValue
    private int id;
    @Column(name="course_id")
    private int courseid;
    @Column(name="week_number")
    private int weeknumber;
    private String title;
    private String description;
    private int level;
    private String difficulty;
    @Column(name="course_category")
    private String coursecategory;
    private boolean isActive;
    @Column(name="created_date")
    private Date createdDate;
    private String createdBy;
    @Column(name="modified_date")
    private Date modifiedDate;
    private String modifiedBy;
}
