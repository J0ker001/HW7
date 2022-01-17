package ru.skypro;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {

        String lastName = "Ivanov";
        String firstName = " Ivan";
        String middleName = " Ivanovich";
        String fullName = lastName + firstName + middleName;
        System.out.println("ФИО сотрудника — " + fullName);
    }

    public static void task2() {

        String fullName = "Ivanov Ivan Ivanovich";
        String fullNameBig = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullNameBig);
    }

    public static void task3() {

        String fullName = "Ivanov Ivan Ivanovich";
        String fullNameReform = fullName.replace(" ", "; ");
        System.out.println("Данные ФИО сотрудника для административного отдела — " + fullNameReform);

    }

    public static void task4() {

        String fullName = "Иванов Семён Семёнович";
        String fullNameReform = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника — " + fullNameReform);
    }
}
