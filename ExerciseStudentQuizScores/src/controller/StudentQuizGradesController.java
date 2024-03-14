package controller;

import dao.StudentRosterDaoImpl;
import dao.StudentRosterDao;
import dto.Grades;
import dto.Student;
import ui.StudentQuizScoresView;
import ui.UserIO;
import ui.UserIOConsoleImpl;

import java.util.List;

public class StudentQuizGradesController {
    private StudentRosterDao dao = new StudentRosterDaoImpl();
    private StudentQuizScoresView view = new StudentQuizScoresView();
    private UserIO io = new UserIOConsoleImpl();

    public void run() {
        boolean keepGoing = true;
        int menuSelection = 0;
        while (keepGoing) {

            menuSelection = getMenuSelection();

            switch (menuSelection) {
                case 1:
                    listStudents();
                    break;
                case 2:
                    createStudent();
                    break;
                case 3:
                    viewStudent();
                    break;
                case 4:
                    removeStudent();
                    break;
                case 5:
                    addGrade();
                    break;
                case 6:
                    keepGoing = false;
                    break;

                default:
                    unknownCommand();
            }

        }
        exitMessage();
    }


    private void createStudent() {
        view.displayCreateStudentBanner();
        Student newStudent = view.getNewStudentInfo();
        dao.addStudent(newStudent.getStudentId(), newStudent);
        view.displayCreateSuccessBanner();
    }
    private void listStudents() {
        view.displayDisplayAllBanner();
        List<Student> studentList = dao.getAllStudents();
        view.displayStudentList(studentList);
    }
    private void viewStudent() {
        view.displayDisplayStudentBanner();
        String studentId = view.getStudentIdChoice();
        Student student = dao.getStudent(studentId);
        view.displayStudent(student);
    }
    private void removeStudent() {
        view.displayRemoveStudentBanner();
        String studentId = view.getStudentIdChoice();
        Student removedStudent = dao.removeStudent(studentId);
        view.displayRemoveResult(removedStudent);
    }
    public void addGrade() {
        StudentQuizScoresView view = new StudentQuizScoresView();
        view.displayAddStudentGrade();
        String studentID = view.getStudentIdToAddGrade();
        Integer grade = Integer.valueOf(view.getGradeValue()); // Ensure this is safe
        Grades.getInstance().addScore(studentID, grade);

        List<Integer> grades = Grades.getInstance().getScores(studentID);
        if (grades != null) {
            view.displayGrades(grades);
        } else {
            view.displayMessage("No grades found for the student with ID: " + studentID);
        }
    }


    private void unknownCommand() {
        view.displayUnknownCommandBanner();
    }

    private void exitMessage() {
        view.displayExitBanner();
    }

    private int getMenuSelection() {
        return view.printMenuAndGetSelection();
    }

}