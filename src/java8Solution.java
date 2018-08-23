import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * java8Solution.java
 *
 * @author g106108
 * @since 8/2/18
 */
public class java8Solution {
    public static void main(String args[]) {
        List<Person> people = Arrays.asList(
                new Person("kassa", "ddddd", 30),
                new Person("yrewqq", "aaaaa", 30),

                new Person("bbb", "cccc", 30),

                new Person("wwww", "fffff", 30)

        );

        //sort list by Last name.

        Collections.sort(people,(o1,o2) ->  o1.getLastName().compareTo(o2.getLastName()));



        // Create a method that prints all the element.
        printAll(people, (p) -> true);
        System.out.println("begining with C");
        begningWithC(people, (p) -> p.getLastName().startsWith("c"));

        System.out.println(" Lamda for each loop");
        people.forEach(p -> System.out.println(p));

    }

    private static void begningWithC( List<Person> people, UnitOneExcres.Condition condition) {
        for (Person p : people) {
            if (p.getLastName().startsWith("c")){
                System.out.println(p);
            }
        }
    }

    private static void printAll(List<Person> people, Condition condition) {
        for(Person p : people){
            System.out.println(p);
        }
    }




    interface  Condition {
        boolean test(Person p);
    }
}
