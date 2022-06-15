package grades;

import util.Input;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;


public class GradesApplication {
    public static HashMap<String, Student> students;

    public static void main(String[] args) {
        String[] studentGitNames = {"fierem", "zoro", "luffy", "chef"};
        String[] studentRealNames = {"Peter", "Simon", "David", "Matthew"};
        students = new HashMap<>();
        Random randie = new Random();
        Input inputter = new Input();
        //generate random students
        for(int i = 0; i < studentGitNames.length; i++){
                Student stu = new Student(studentRealNames[i]);
                for(int j = 0; j < 4; j++){
                    stu.addGrade(randie.nextInt(100)+1);
                }
                students.put(studentGitNames[i], stu);
            }
        boolean lookUpStudents = true;
        displayWelcome();
        while(lookUpStudents){
            showGitNames();
            displayChoices();
            System.out.print("Please enter an option: ");
            int choice = inputter.getInt();
            switch(choice){
                case 0:
                    System.out.println("Have a nice day.  Goodbye.");
                    lookUpStudents = false;
                    break;
                case 1:
                    getGitStudent();
                    break;
                case 2:
                    showClassAverage();
                    break;
                case 3:
                    displayCSV();
                    break;
                case 4: // add attendance
                    addAttendance();
                    break;
                case 5://show attendance
                    showAttendance();
                    break;
                case 6: // get absent days shown
                    showAbsentDays();
                    break;

            }
        }
    }

    public static void showAbsentDays(){
        String choice = getValidUser();
        students.get(choice).getAbsentDays();

    }

    public static void showAttendance(){
        String choice = getValidUser();
        students.get(choice).getFullAttendanceRecord();
    }

    public static void addAttendance(){
        System.out.println("Please choose Github username to add attendance: ");
        String username = getValidUser();
        Input inputter = new Input();
        System.out.println("Enter the date for attendance: (YYYY-MM-DD)");
        String attendDate = inputter.getString();
        String attend = getAttendance();
        students.get(username).recordAttendance(attendDate, attend);
    }

    public static String getValidUser(){
        Input inputter = new Input();
        System.out.println("Please choose one of the following usernames: ");
        showOnlyGitNames();
        String username = inputter.getString();
        if(students.containsKey(username)){
            return username;
        }else{
            System.out.println("Invalid username.");
            return getValidUser();
        }
    }

    public static void showGitNames(){
        System.out.println("\nHere are the Github usernames of the students: \n");
        for (String i: students.keySet()){
            System.out.printf("|%s| ",i);
        }
        System.out.println("");
    }

    public static void showOnlyGitNames(){
        for (String i: students.keySet()){
            System.out.printf("|%s| ",i);
        }
        System.out.println("");
    }

    public static void showClassAverage(){
        double average = 0;
        for (String i: students.keySet()){
            average += students.get(i).getGradeAverage();
        }
        System.out.println("\nThe class grade average is: " + (average/students.size()));
    }

    public static Student getGitStudent(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What student would you like to see more information on?");
        String nameRequest = scanner.next();
        if(students.containsKey(nameRequest)){
            System.out.format("Name: %s - Github Username: %s\nCurrent Average: %.2f", students.get(nameRequest).getName(), nameRequest, students.get(nameRequest).getGradeAverage()  );
            System.out.print("\nThe students test grades are: ");
            for(Integer grade: students.get(nameRequest).getGrades()){
                System.out.print(" " + grade);
            }
            System.out.println("");
            return students.get(nameRequest);
        }else{
            System.out.printf("Sorry, no student found with the GitHub username of \"%s\".\n", nameRequest);
            return getGitStudent();
        }
    }

    public static void displayWelcome(){
        System.out.println("Welcome");
    }

    public static void displayChoices(){
        System.out.println("\nWhat would you like to do?");
        System.out.println("1 - show student info by Git username");
        System.out.println("2 - show class average");
        System.out.println("3 - show class csv");
        System.out.println("4- add attendance");
        System.out.println("5- show attendance record");
        System.out.println("6 - show absent days");
        System.out.println("0 - exit program");
    }

    public static void displayCSV(){
//        name,github_username,average
//        Zach,zgulde,81.2
        for (String i: students.keySet()){
            System.out.printf("%s,%s,%.2f%n",students.get(i).getName(),i,students.get(i).getGradeAverage());
        }
    }

    public static String getAttendance(){
        String attend = "";
        Input inputter = new Input();
        System.out.println("Did the student attend today? enter [P/A]");
        attend = inputter.getString();
        if(attend.equals("P") || attend.equals("A")){
            return attend;
        }else{
            System.out.println("Invalid attendance input: please enter P for present or A for absent");
            return getAttendance();
        }
    }




}
