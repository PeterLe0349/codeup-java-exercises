import java.util.Scanner;

public class TestTestTest {
    public static void main(String[] args){
//        System.out.println(24%2 == 0);
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            //Complete this line
            System.out.printf("%15s %3d", s1, x);
        }
        System.out.println("================================");

    }
}
