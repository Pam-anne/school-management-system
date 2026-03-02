package school_management_system;

import java.util.ArrayList;

/* This class is created to keep records of all students, teachers, total Money earned by the School, total  money spent by the school*/
public class Schools {

    private ArrayList<Teacher> teachers;
    private ArrayList<Student> students;
    private static double totalMoneyEarned;
    private static double totalMoneySpent;

    /**
     * new school object is created
     * 
     * @param teachers list of teachers in the school
     * @param students list of students in the school
     */
    public Schools(ArrayList<Teacher> teachers, ArrayList<Student> students)

    {

        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }

    /**
     * Adds a teacher to the school
     * 
     * @param teachers the teacher to be added
     */
    public void addTeachers(Teacher teachers) {
        teachers.add(teachers);

    }

    /**
     * 
     * @return returns the list of the teachers
     */
    public ArrayList<Teacher> getTeachers() {
        return teachers;

    }

    /**
     * Adds a student to the school
     * 
     * @param students the student to be added
     */
    public void addStudents(Student students) {

        students.add(students);
        // System.out.println("New student "+students+)

    }

    /**
     * 
     * @return returns the list of the student
     */
    public ArrayList<Student> getStudents() {
        return students;
    }

    /**
     * Update the total money spent by the school by keep subtracting the
     * totalMoneySpent from the totalMoneyEarned
     * 
     * @param totalMoneySpent is the money spent by the school
     */
    public static void updateTotalMoneySpent(double totalMoneySpents) {
        totalMoneySpent += totalMoneySpents;
    }

    /**
     * 
     * @return returns the total money earned by the school
     */
    public Double getTotalMoneySpent() {
        return totalMoneySpent;

    }

    /**
     * updates the total money earned by keep adding it into the totalMoneyEarned
     * 
     * @param totalMoneyEarn is the money earned by the school
     */
    public static void updateTotalMoneyEarned(double totalMoneyEarn) {
        totalMoneyEarned += totalMoneyEarn;
    }

    /**
     * 
     * @return returns the total money earned by the school
     */
    public Double getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public void salaries() {

    }
}

    
    
