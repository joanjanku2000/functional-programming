package streams;


import imperative.Main;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class _Stream {

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", Gender.MALE),
                new Person("Maria", Gender.FEMALE),
                new Person("Alex", Gender.MALE),
                new Person("Alice", Gender.FEMALE),
                new Person("Aisha", Gender.FEMALE)
        );

        Set<Gender> genderSet =  people.stream()
                .map(person -> person.gender)
                .collect(Collectors.toSet());
        System.out.println(genderSet);
        System.out.println("-------Lengths of each name------");
        people.stream()
                        .map(person -> person.name)
                                .mapToInt(String::length)
                                        .forEach(System.out::println);


       boolean containsOnlyMales = people.stream().allMatch(person -> person.gender == Gender.MALE);
       // also kemi anyMatch() , nonMatch() which takes the same parameter: a predicate
        System.out.println("Contains only males : "+containsOnlyMales);

    }
    static class Person{
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender){
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
