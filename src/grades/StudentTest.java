package grades;

public class StudentTest {
    public static void main (String[] args){
        Student stud = new Student("Peter");
        System.out.println(stud.getName());
        stud.addGrade(90);
        System.out.println(stud.getGradeAverage());
        stud.addGrade(100);
        System.out.println(stud.getGradeAverage());

    }
}
