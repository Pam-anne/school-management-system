package school_management_system;

/**
 * This class is created to keep record of student's name, id, grade, total fee,
 * fee paid, remaining fee
 */
public class Student {

    private int id;
    private String name;
    private int grade;
    private double totalFee;
    private double feePaid;
    private double remainingFee;

    /**
     * New Student object is created Total fees for every Student is $20,000.
     * Initially, fee paid by every student is $0.
     */
    public Student(int id, String name, int grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.totalFee = 10000;
        this.feePaid = 0;
    }

    /**
     * This setter is used to update the new grade of a student.
     * 
     * @param grade grade is the new grade of the student.
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }

    /**
     * This setter is updating the fee of the student by keep adding the fee to the
     * recentFeePaid School is earning by the fee of students and it is updating
     * updateTotalMoneyEarned.
     * 
     * @param recentFeePaid recentFeePaid is the recent amount paid by the student
     */
    public void Feepaid(double recentFeePaid) {
        double recent = recentFeePaid;
        Schools.updateTotalMoneyEarned(recent);
        feePaid += recent;
        System.out.println("$" + feePaid + " is paid by " + name + " till now.");
        if (feePaid == 10000) {
            System.out.println("The whole fee is paid by " + name + " (id number: " + id + ")\n");

        } else {
            System.out.println("$" + getRemainingFee() + " is still left to pay by " + name + "\n ");
        }

    }

    /**
     * 
     * @return returns the id of student
     */
    public int getId() {
        return id;
    }

    /**
     * 
     * @return returns the name of a student
     */
    public String getName() {
        return name;

    }

    /**
     *
     * @return returns the grade of a student
     */
    public int getGrade() {
        return grade;
    }

    /**
     * 
     * @return returns the total fee
     */
    public double getTotalFee() {
        return totalFee;
    }

    /**
     * 
     * @return returns the fee paid by the student till now
     */
    public double getFeePaid() {
        return feePaid;
    }

    /**
     * 
     * @return returns the remaing fees to be paid by the student
     */
    public double getRemainingFee() {

        return remainingFee = totalFee - feePaid;

    }

    /**
     * returns the name of the student and feePaid so far
     */
    public String toString() {

        return "Student name is: " + name + " and has id number " + id + ". The fee paid so far is $" + feePaid + "\n";
    }

    public void add(Student students) {

        System.out.println("New student " + name + " has taken admission into the school");
    }

}
