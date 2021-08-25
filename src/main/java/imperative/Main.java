package imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String...args){
        List<Person> people = List.of(
                new Person("John",Gender.MALE),
                new Person("Maria",Gender.FEMALE),
                new Person("Alex",Gender.MALE),
                new Person("Alice",Gender.FEMALE),
                new Person("Aisha",Gender.FEMALE)
        );

        System.out.println("---Imperative approach---");
        List<Person> females = new ArrayList<>();
        for (Person p : people){
            if (p.gender==Gender.FEMALE){
                females.add(p);
            }
        }

        for (Person p : females){
            System.out.println(p);
        }

        System.out.println("---Declarative approach (functional style)---");

        List<Person> males = people.stream().parallel()
                .filter(p -> p.gender == Gender.MALE)
                .collect(Collectors.toList());

        males.stream().forEach(System.out::println);


    }

    static class Person{
        private final String name;
        private final Gender gender;

        Person(String name,Gender gender){
            this.name = name;
            this.gender = gender;
        }

        public String toString(){
            return "[ Name = "+name + ", Gender = "+gender + " ]";
        }
    }
    enum Gender{
        MALE,FEMALE
    }


}
