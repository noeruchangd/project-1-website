package com.soict.project1.models.users;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.Getter;

import java.util.ArrayList;
@Getter
@Setter
@RequiredArgsConstructor
public class Learner {
    private int UserID;
    @NonNull
    private String name;
    @NonNull
    private String email;
    @NonNull
    private String password;
    private Boolean isAdmin = false;
    private Boolean isBanned = false;
    private ArrayList<String> enrolledCourses;
}
