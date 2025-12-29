package com.soict.project1.models.courses;

import com.soict.project1.models.users.*;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.Getter;

import java.util.Date;
import java.util.Map;

@Getter
@Setter
@RequiredArgsConstructor
public class Course {
    private String courseID;
    private String courseName;
    private Admin createdBy;
    private Date createdDate;
    private Date expiryDate;
    private String description;
    private Map<Learner, Double> studentScores;
}
