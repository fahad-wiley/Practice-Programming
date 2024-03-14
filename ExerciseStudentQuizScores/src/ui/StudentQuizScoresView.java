package ui;

import dto.Grades;
import dto.Student;

import java.util.List;

public class StudentQuizScoresView {

    private UserIO io = new UserIOConsoleImpl();

    public int printMenuAndGetSelection() {
        io.print("Main Menu");
        io.print("1. List Students");
        io.print("2. Create New Student");
        io.print("3. View a Student");
        io.print("4. Remove a Student");
        io.print("5. Add a grade to a student");
        io.print("6. Exit");

        return io.readInt("Please select from the above choices.", 1, 6);
    }
    public void displayStudentList(List<Student> studentList) {
        for (Student currentStudent : studentList) {
            // Updated to include the grade in the output
            String studentInfo = String.format("#%s : %s %s - Grade: %s",
                    currentStudent.getStudentId(),
                    currentStudent.getFirstName(),
                    currentStudent.getLastName(),
                    currentStudent.getGrade()); // Now the grade is included in the string
            io.print(studentInfo);
        }
        io.readString("Please hit enter to continue.");
    }
    public Student getNewStudentInfo() {
        String studentId = io.readString("Please enter Student ID");
        String firstName = io.readString("Please enter First Name");
        String lastName = io.readString("Please enter Last Name");
        String cohort = io.readString("Please enter Cohort");
        String grade = io.readString("Please enter grade");
        Student currentStudent = new Student(studentId);
        currentStudent.setFirstName(firstName);
        currentStudent.setLastName(lastName);
        currentStudent.setCohort(cohort);
        currentStudent.setGrade(Integer.parseInt(grade));
        return currentStudent;
    }
    public void displayCreateStudentBanner() {
        io.print("=== Create Student ===");
    }
    public void displayCreateSuccessBanner() {
        io.readString(
                "Student successfully created.  Please hit enter to continue");
    }
    public void displayDisplayAllBanner() {
        io.print("=== Display All Students ===");
    }
    public void displayDisplayStudentBanner () {
        io.print("=== Display Student ===");
    }

    public String getStudentIdChoice() {
        return io.readString("Please enter the Student ID.");
    }

    public void displayStudent(Student student) {
        String avgGrade = String.valueOf(Grades.getInstance().getAverageScore(student.getStudentId()));
        if (student != null) {
            io.print(student.getStudentId());
            io.print(student.getFirstName() + " " + student.getLastName());
            io.print(student.getCohort());
            io.print("" + student.getGrade());
            io.print("Average grade" + avgGrade);
        } else {
            io.print("No such student.");
        }
        io.readString("Please hit enter to continue.");
    }
    public void displayRemoveStudentBanner () {
        io.print("=== Remove Student ===");
    }
    public void displayAddStudentGrade () {
        io.print("=== Add a grade ===");
    }

    public void displayRemoveResult(Student studentRecord) {
        if(studentRecord != null){
            io.print("Student successfully removed.");
        }else{
            io.print("No such student.");
        }
        io.readString("Please hit enter to continue.");
    }
    public void displayExitBanner() {
        io.print("Good Bye!!!");
    }

    public void displayUnknownCommandBanner() {
        io.print("Unknown Command!!!");
    }

    public String getStudentIdToAddGrade() {
        return io.readString("Student ID.");
    }
    public String getGradeValue() {
        return io.readString("What is the grade you would like to add.");
    }

    public void displayGrades(List<Integer> arr) {
        io.print(arr.toString());
    }

    public void displayMessage(String s) {
        io.print(s);
    }
}