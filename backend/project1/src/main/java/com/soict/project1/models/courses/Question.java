package com.soict.project1.models.courses;


import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@Setter
@Getter
@RequiredArgsConstructor
public class Question {
    private int questionID;
    @NonNull
    private String prompt;
    @NonNull
    private QuestionType questionType;
    private ArrayList<String> options;
    @NonNull
    private String correctAnswer;

}
