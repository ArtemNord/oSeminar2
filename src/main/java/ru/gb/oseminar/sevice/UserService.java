package ru.gb.oseminar.sevice;

import ru.gb.oseminar.data.Student;
import ru.gb.oseminar.data.User;

import java.util.ArrayList;
import java.util.List;

public class UserService implements DataService{

    private final List<User> users;

    public UserService() {
        this.users = new ArrayList<>();
    }

    @Override
    public void createUser(String firstName, String lastName, String patronymic) {
        Long id = 0L;
        for (User item: this.users) {
            if (item instanceof Student) {
                if (id < ((Student) item).getStudentID()){
                    id = (Long)((Student) item).getStudentID();
                }
            }
        }
        this.users.add(new Student(firstName, lastName, patronymic, ++id));
    }

    @Override
    public List<User> getAll() {
        return this.users;
    }

    @Override
    public void deleteUser(Long id) {
        for (User item: this.users) {
            if (item instanceof Student) {
                if (id.equals(((Student) item).getStudentID())) {
                    this.users.remove(item);
                }
            }
        }
    }
}
