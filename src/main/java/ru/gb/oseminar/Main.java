package ru.gb.oseminar;

import ru.gb.oseminar.controller.Controller;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createUser("Name",
                "LastName",
                "Patronymic");
    }
}