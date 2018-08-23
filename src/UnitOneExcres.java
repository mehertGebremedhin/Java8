import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


/**
 * UnitOneExcres.java
 *
 * @author g106108
 * @since 8/1/18
 */
public class UnitOneExcres {
    public static void main(String args[]) {
        List<Person> people = Arrays.asList(
                new Person("kassa", "ddddd", 30),
                new Person("yrewqq", "aaaaa", 30),

                new Person("bbb", "cccc", 30),

                new Person("wwww", "fffff", 30)

                );

        //sort list by Last name.

        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });

        // Create a method that prints all the element.
        printAll(people);
        System.out.println("begining with C");
        begningWithC(people, new Condition() {
            @Override
            public boolean test(Person p) {
                return p.getLastName().startsWith("c");


            }
        });

    }

    private static void begningWithC( List<Person> people, Condition condition) {
        for (Person p : people) {
            if (p.getLastName().startsWith("c")){
                System.out.println(p);
            }
        }
    }

    private static void printAll(List<Person> people) {
        for(Person p : people){
            System.out.println(p);
        }
    }


    interface  Condition {
        boolean test(Person p);
    }
}
