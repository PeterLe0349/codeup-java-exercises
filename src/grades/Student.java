package grades;

import util.Input;

import java.util.ArrayList;
import java.util.HashMap;

public class Student {
    private final String name;
    private final ArrayList<Integer> grades;
    private final HashMap<String, String> attendance = new HashMap<>();

    public Student(String name){
        this.name = name;
        grades = new ArrayList<>();
    }

    // returns the student's name
    public String getName(){
        return name;
    }
    // adds the given grade to the grades property
    public void addGrade(int grade){
        grades.add(grade);
    }
    // returns the average of the students grades
    public double getGradeAverage(){
        double average = 0;
        for (Integer grade : grades) {
            average += grade;
        }
        return average/grades.size();
    }

    public ArrayList<Integer> getGrades(){
        return grades;
    }

    public void recordAttendance(String date, String value){
        attendance.put(date, value);
    }

    public String getAttendance(){
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

    public void getFullAttendanceRecord(){
        int attendrate = 0;
        for(String s: attendance.values()){
            if(s.equals("P")){
                attendrate++;
            }
        }
        System.out.printf("Student attendance rate: %d / %d days %n ", attendrate, attendance.size());
        for(String day: attendance.keySet()){
            System.out.printf("%s: %s |", day, attendance.get(day));
        }
    }

    public void getAbsentDays(){
        int absentdays = 0;
        System.out.print("Student absent on: ");
        for(String s: attendance.keySet()){
            if(attendance.get(s).equals("A")){
                System.out.print(s + "| ");
                absentdays++;
            }
        }
        System.out.printf("\nStudent absent rate: %d / %d days %n ", absentdays, attendance.size());
    }
}
