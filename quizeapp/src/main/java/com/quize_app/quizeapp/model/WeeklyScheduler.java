package com.quize_app.quizeapp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
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
    private Boolean isActive;
    @Column(name="created_date")
    private Date createdDate;
    private String createdBy;
    @Column(name="modified_date")
    private Date modifiedDate;
    private String modifiedBy;

//  @OneToMany(cascade = CascadeType.ALL)
//  //@JoinColumn(name="weekly_id")
//   private List<DailySchedule> dailySchedules=new ArrayList<>();

}
