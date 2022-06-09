class Person {
    public static long worldPopulation = 7_500_000_000L; // class property
    public String name; // instance property

    public static void main(String[] args) {
//        Person theBestDrummerAlive = new Person();
//        theBestDrummerAlive.name = "Neil Peart";

//        Person.worldPopulation += 1; // accessing a static property

//        System.out.println(Person.worldPopulation); // 7500000001

        // technically this will work, but it is usually better to reference
        // static properties through the class, not instances
//        System.out.println(theBestDrummerAlive.worldPopulation); // 7500000001

        // DONT DO THIS, it will not compile
//        System.out.println(Person.name);
    }

    public String sayName(){
        return "Hello, I'm " + name;
    }

}