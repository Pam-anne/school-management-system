package school_management_system;

/**
 * This class is created to keep the record of teacher's name, id, salary and
 * salary earned by them.
 */
public class Teacher {
    private String tName;
    private int tid;
    private double salary;

    /**
     * New Teacher object is created
     * 
     * @param tName  is name of Teacher
     * @param tid    id of the teacher
     * @param salary of the teacher Initially, salary earned by the teacher is 0
     */
    public Teacher(String tName, int tid, double salary) {
        this.tName = tName;
        this.tid = tid;
        this.salary = salary;
    }

    /**
     * update the salary of the teacher
     * 
     * @param salary is the new salary
     */
    public void setSalary(double salary) {

        double incrementedBy = salary - this.salary;
        this.salary = salary;

        // System.out.println(this.salary);
        System.out.println("Now, the salary of " + getTName() + " is incremented by " + incrementedBy
                + " and the new salary is " + this.salary + "\n");

    }

    /**
     * 
     * @return returns the name of the teacher
     */
    public String getTName() {
        return this.tName;
    }

    /**
     * 
     * @return returns the id of the teacher
     */
    public int getTid() {
        return this.tid;
    }

    /**
     * 
     * @return the salary of the teacher
     */
    public double getSalary() {

        Schools.updateTotalMoneySpent(this.salary);

        return this.salary;
    }

    /**
     * returns the name of the teacher and salaryEarned so far
     */
    public String toString() {
        return "Teacher name is: " + tName + " and has a teacher id: " + tid + ". The salary is: " + getSalary() + "\n";
    }

    public void add(Teacher teachers) {
        System.out.println("New teacher named " + tName + " has joined the school");
    }

}

