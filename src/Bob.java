import java.util.Scanner;

public class Bob {
    public static void main(String[] args){
        boolean stopConvo = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi, I'm' Bob.  What do you want to say?  Say bye if you want to stop talking.");
        do{
            String convo = scanner.nextLine();
            if(convo.equals("bye")){
                System.out.println("Bob:  Bye!!");
                stopConvo = true;
            }else if(convo.endsWith("?")){
                System.out.println("Sure");
            }else if(convo.endsWith("!")){
                System.out.println("Whoa. Chill out!");
            }else if(convo.equals("")){
                System.out.println("Fine.  Be that way!");
            }else {
                System.out.println("Whatever.");
            }
        }while (!stopConvo);
    }
}
