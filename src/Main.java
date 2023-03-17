public class Main {
    public static void main(String[] args) {
        //Домашнее задание
        System.out.println("Домашнее задание");
        //Задача 1
        System.out.println("Задача 1");

        String firstName = "Ivan";
        String middleName = "Ivanov";
        String lastName = "Ivanovich";
        String fullName = middleName + " " + firstName + " " + lastName;
        System.out.println("ФИО сотрудника " + fullName);

        //Задача 2
        System.out.println("Задача 2");

        String fullName2 = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName2);

        //Task3
        System.out.println("Task 3");
        String middleName2 = "Иванов";
        String firstName2 = "Семён";
        String lastName2 = "Семёнович";
        String fullName1 = middleName2 + " " + firstName2 + " " + lastName2;
        String fullName3 = fullName1.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника — " + fullName3);
    }

}