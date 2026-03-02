
package school_management_system;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // Adding the data of Teachers
        Teacher anna = new Teacher("Anna", 111, 1000);
        Teacher harry = new Teacher("Harry", 112, 2500);
        Teacher brian = new Teacher("Brian", 113, 1500);
        Teacher ron = new Teacher("Ron", 114, 1700);

        // Adding the teachers to the list of Teachers
        ArrayList<Teacher> teacherList = new ArrayList<>();
        teacherList.add(anna);
        teacherList.add(harry);
        teacherList.add(brian);
        teacherList.add(ron);

        // Adding the data of Students
        Student nav = new Student(1, "Navpreet Kaur", 11);
        Student komal = new Student(2, "Komalpreet Kaur", 11);
        Student jyoti = new Student(3, "Amanjot Kaur", 11);
        Student kat = new Student(4, "Kat", 11);

        // Adding the students to the list of Students
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(nav);
        studentList.add(komal);
        studentList.add(jyoti);
        studentList.add(kat);

        // Creating an Object of the School Class
        Schools ghg = new Schools(teacherList, studentList);

        System.out.println("Initially, School has earned $" + ghg.getTotalMoneyEarned());

        // Paying fee by these Students
        nav.Feepaid(200);
        komal.Feepaid(1000);
        jyoti.Feepaid(3000);
        kat.Feepaid(2000);
        nav.Feepaid(5000);
        nav.Feepaid(4800);
        komal.Feepaid(100);

        // Adding new teachers and Students to the list.
        ghg.addTeachers(ron);
        ghg.addStudents(kat);

        // Updating the salary of teachers.
        anna.setSalary(1900);
        harry.setSalary(4000);

        // System.out.println(ghg.getStudents());
        // Printing the list of Students and Teachers.
        System.out.println(studentList);
        System.out.println(teacherList);

        // Printing the Total Money earned by School till now.
        System.out.println("School has earned $" + ghg.getTotalMoneyEarned() + " till now.");

        // Printing the Total Money Spent by the School.
        System.out.println("School has spent $" + ghg.getTotalMoneySpent() + " till now.");

        // If we want to fetch the data of any particulat student or teacher.
        System.out.println(nav);
        System.out.println(anna);

    }
}
