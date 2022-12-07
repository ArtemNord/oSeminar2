package ru.gb.oseminar.sevice;


import ru.gb.oseminar.data.Student;
import ru.gb.oseminar.data.StudyGroup;
import ru.gb.oseminar.data.Teacher;

import java.util.List;

public class StudyGroupService {
    private StudyGroup studyGroup;

    public StudyGroupService(){

    }

    public void createStudyGroup(Teacher teacher, List<Student> students) {
        this.studyGroup = new StudyGroup(teacher, students);
    }

    public StudyGroup getStudyGroup() {
        return studyGroup;
    }

    public void setStudyGroup(StudyGroup studyGroup) {
        this.studyGroup = studyGroup;
    }
}
