package com.soict.project1.models.users;

public class Admin extends Learner {
    public Admin(String email, String password, String name) {
        super(email, password, name);
        this.setIsAdmin(true);
    }

}
