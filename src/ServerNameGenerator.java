import java.util.Random;

public class ServerNameGenerator {
    public static String[] adjArray = {"happy", "sad", "angry", "surprised", "elegant", "smart", "cute", "stupid", "amazing", "scary" };
    public static String[] nounArray = {"boy", "girl", "man", "woman", "child", "adult", "human", "animal", "cat", "dog" };

    public static void main(String[] args) {

//        for(int i = 0; i < 10; i++) {
//            System.out.print(sayStringAt(adjArray) + " ");
//        }
        System.out.println("Here is your server name:");
        System.out.println(sayStringAt(adjArray) + "-" + sayStringAt(nounArray));
    }
//return a random string from array
    public static String sayStringAt(String[] strArray){
        Random rand = new Random();
        int randie = rand.nextInt(strArray.length);
        return strArray[randie];
    }


}
