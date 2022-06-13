import java.util.Arrays;

public class ArraysExercises {

    public static void main (String[] args){

//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));
//        Person person1 = new Person("Bob");
//        person1.sayHello();

        Person[] persons = new Person[3];
        for(int i = 0; i < persons.length; i++){
            String[] names = {"Peter", "Petrus", "Pedro"};
            persons[i] = new Person(names[i]);
        }
//        for (Person person : persons) {
//            person.sayHello();
//        }

        Person[] newPersons = addPerson(persons, new Person("Piotr"));
        for(int i = 0; i < newPersons.length; i++){
            newPersons[i].sayHello();
        }
    }

    public static Person[] addPerson(Person[] persons, Person newGuy){
        Person[] personsNew = new Person[persons.length+1];
        System.out.println(personsNew.length);
        System.arraycopy(persons, 0, personsNew, 0, persons.length);
        personsNew[personsNew.length-1] = newGuy;
//        for(int i = 0; i< personsNew.length; i++){
//            personsNew[i].sayHello();
//        }
        return personsNew;
    }
}
