package com.company.lesson5;

public class main {

    public static void main(String[] args) {

        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        employees[1] = new Employee("Ivanov Ivan1", "Engineer1", "ivivan1@mailbox.com", "892312313", 31000, 31);
        employees[2] = new Employee("Ivanov Ivan2", "Engineer2", "ivivan2@mailbox.com", "892312314", 32000, 32);
        employees[3] = new Employee("Ivanov Ivan3", "Engineer3", "ivivan3@mailbox.com", "892312315", 33000, 33);
        employees[4] = new Employee("Ivanov Ivan4", "Engineer4", "ivivan4@mailbox.com", "892312316", 34000, 34);

        for (int i = 0; i < employees.length; i++) {
            if (Employee.getAge() >= 40) {
                System.out.println(Employee.toString());
            }
        }
    }
}
