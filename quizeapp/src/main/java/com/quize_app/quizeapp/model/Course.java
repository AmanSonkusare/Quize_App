package com.quize_app.quizeapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Entity
public class Course {
    @Id
    @GeneratedValue
    private int id;
    @Column(name="course_Title")
    private String courseTitle;
    @Column(name="creat_Date")
    private String creatDate;
    private String creatBy;
    @Column(name="modified_Date")
    private String modifiedDate;
    private String modifiedBy;
    private String description;


}
