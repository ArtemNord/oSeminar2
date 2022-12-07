package ru.gb.oseminar.view;

import ru.gb.oseminar.data.Student;
import ru.gb.oseminar.data.StudyGroup;
import ru.gb.oseminar.data.User;

import java.util.List;
import java.util.logging.Logger;

public class StudentView {
    public void sendOnConsole(List<User> users) {
        Logger logger = Logger.getLogger(StudyGroup.class.getName());

        for (User user : users) {
            logger.info(user.toString());
        }
    }

    public void showStudyGroups(List<StudyGroup> studyGroups) {
        Logger logger = Logger.getLogger(StudyGroup.class.getName());

        for (StudyGroup group : studyGroups) {
            logger.info(group.toString());
        }
    }

    public void showStudents(List<Student> studyGroups) {
        Logger logger = Logger.getLogger(StudentView.class.getName());

        for (Student group : studyGroups) {
            logger.info(group.toString());
        }
    }
}
