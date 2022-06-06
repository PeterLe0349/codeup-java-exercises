public class TestMethods {
    public static void main(String[] args){
        System.out.println("HIdasfsdf");
//        test();
        sayHello();
        sayHello("Peter");
    }

    public static void test(){
        System.out.println("hi");
    }

    // version 1
    public static void sayHello(int times) {
        for (int i = 0; i < times; i += 1) {
            sayHello();
        }
    }
    // version 2
    public static void sayHello() {
        sayHello("Hello", "World");
    }
    // version 3
    public static void sayHello(String name) {
        sayHello("Hello", name);
    }
    // version 4
    public static void sayHello(String greeting, String name) {
        System.out.println(greeting + ", " + name + "!");
    }



}
