/*Create three classes
-	Faculty with two data members facultyId and salary and two methods, one intput() method for accepting facultyId as input and another printSalary() to print salary.
-	FullTimeFaculty that inherits class Faculty with two data members’ basicSalary and allowance. Override input() method in this class that calls super class inut() method and
 accepts basicSalary and allowance as input. Salary should not be accepted as input but should be calculated using formula (basicSalary + allowance)
-	PartTimeFaculty that inherits class Faculty with two data members’ workingHours, ratePerHour. Override input() method in this class that calls super class inut() method and 
accepts workingHours and ratePerHour as input. Salary should not be accepted as input but should be calculated using formula ( workingHour * ratePerHour )
 */



class Student {
    private int rollNo;
    private double percentage;

    Student() {
        // rollNo = -1;
        percentage = 0;
    }

    Student(int rollNo, double percentage) {
        this.rollNo = rollNo;
        this.percentage = percentage;
    }

    void show() {
        System.out.print("Roll no. : " + rollNo + " Percentage: " + percentage + "%");
    }

    int getRollNo() {
        return rollNo;
    }

    double getPercentage() {
        return percentage;
    }

}

class CollegeStudent extends Student {
    private int semester;

    CollegeStudent() {
        semester = 0;
    }

    CollegeStudent(int rollNo, double percentage, int semester) {
        super(rollNo, percentage);
        this.semester = semester;
    }

    void show() {
        super.show();
        System.out.println(" Sem: " + semester);
    }

}

class SchoolStudent extends Student {
    private int className;

    SchoolStudent() {
        className = 0;
    }

    SchoolStudent(int rollNo, double percentage, int className) {
        super(rollNo, percentage);
        this.className = className;
    }

    void show() {
        super.show();
        System.out.println(" className: " + className);
    }

}

public class Q45 {

    public static void main(String[] args) {
        Student sArr[] = { new CollegeStudent(10, 60, 1), new CollegeStudent(12, 80, 2), new SchoolStudent(15, 95, 10),
                new SchoolStudent(16, 90, 8), new SchoolStudent(18, 70, 7) };

        for (Student s : sArr) {
            s.show();
        }

        int searchRollNo = 15;

        for (Student s : sArr) {
            if (s.getRollNo() == searchRollNo) {

                if (s instanceof CollegeStudent)
                    System.out.println("This is a college student with following details:");
                else if (s instanceof SchoolStudent)
                    System.out.println("This is a School student with following details:");
                s.show();
            }
        }
        int count = 0;
        for (Student s : sArr) {
            if (s.getPercentage() >= 75) {
                System.out.print("Grade = A  ");
                s.show();
                count++;
            }
        }

        System.out.println("No of students with A grade: " + count);

    }

}