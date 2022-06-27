package util;

import util.Input;

public class InputTest {
    public static void main(String[] args) {
        Input tester = new Input();
//        System.out.println("You entered: " + tester.getString());
//        System.out.println(tester.yesNo());
//        System.out.println(tester.getInt());
//        System.out.println(tester.getInt(23, 34));
//        System.out.println(tester.getDouble());
//        System.out.println(tester.getDouble(1232.123213, 34234.1231));
//        int num = tester.getInt();
        //Test with catch exception change
//        System.out.println("The number is: " + num);
//        double dub = tester.getDouble();
//        System.out.println("The double is: " + dub);
//            int binn = tester.getBinary();
//        System.out.println(binn);
//        int hex = tester.getHex();
////        System.out.println(hex);
//         int num = tester.getInt(1,5);
//        System.out.println(num);
        double doub = tester.getDouble(10.0, 100.11);
        System.out.println(doub);

    }
}
