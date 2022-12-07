package ru.gb.oseminar.controller;


import ru.gb.oseminar.data.*;
import ru.gb.oseminar.sevice.StudyGroupService;
import ru.gb.oseminar.sevice.UserService;
import ru.gb.oseminar.view.StudentView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Controller {
    public UserService userService = new UserService();
    public StudentView studentView = new StudentView();
    public StudyGroupService studyGroupService = new StudyGroupService();


    public void createUser (String firstName, String lastName, String patronymic) {
        userService.createUser(firstName, lastName, patronymic);
        List<User> students = userService.getAll();
        studentView.sendOnConsole(students);
    }

    public void createStudyGroup (){
        List<User> users = this.userService.getAll();
        Teacher teacher = null;
        List<Student> students = new ArrayList<>();

        for (User user : users) {
            if (user instanceof Teacher) {
                teacher = (Teacher) user;
            } else if (user instanceof Student) {
                students.add((Student) user);
            }

        }
        this.studyGroupService.createStudyGroup(teacher, students);
        StudyGroup studyGroup = this.studyGroupService.getStudyGroup();
    }

    public void showTeacherInfo(Teacher teacher){
        List<User> teachers = new ArrayList<>();
        teachers.add(teacher);
        studentView.sendOnConsole(teachers);
    }

    public List<StudyGroup> createTimetable(Teacher teacher, List<Student> studentList){
        return studyGroupService.compliteStudyGroup(teacher, studentList);
    }

    public void showStudyGrpup(Teacher teacher, List<Student> studentList){
        return studyGroupService.compliteStudyGroup(teacher, studentList);
    }

    public void showSortStudyGroup(List <Student> studentList) {
        Collections.sort(studentList, new StudyGroupComparator());
        studentView.showStudents(studentList);
    }
}
