package ru.gb.oseminar.controller;


import ru.gb.oseminar.data.User;
import ru.gb.oseminar.sevice.UserService;
import ru.gb.oseminar.view.StudentView;

import java.util.List;

public class Controller {
    public UserService userService = new UserService();
    public StudentView studentView = new StudentView();

    public void createUser (String firstName, String lastName, String patronymic) {
        userService.createUser(firstName, lastName, patronymic);
        List<User> students = userService.getAll();
        studentView.sendOnConsole(students);
    }
}
