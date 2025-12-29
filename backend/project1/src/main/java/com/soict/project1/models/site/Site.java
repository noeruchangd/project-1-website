package com.soict.project1.models.site;

import com.soict.project1.models.courses.*;
import com.soict.project1.models.users.*;
import lombok.Setter;

import java.util.ArrayList;
import lombok.Getter;

@Setter
@Getter
public class Site {
    private ArrayList<Learner> learners;
    private ArrayList<Admin> admins;
    private ArrayList<Course> courses;
}
