package com.dataart.thucydides.models;

//reused from Selenium Course - timestaps for created users were removed

public class UserBuilder {

    public static User admin() {
        User user = new User("admin", "admin");

        user.setFname("Ivan");
        user.setLname("Petrov");
        return user;
    }

    public static User simpleUser () {
        User user = new User("user", "user");
        user.setFname("Alex");
        user.setLname("Chernyshev");
        user.setRole("USER");
        return user;
    }

    public static User developer () {
        User user = new User("dev", "dev");
        user.setFname("Alex");
        user.setLname("Chernyshev");
        user.setRole("DEVELOPER");
        return user;
    }
}
