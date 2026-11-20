package com.pluralsight;

import com.pluralsight.loops.Person;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataProcessing {

    public static void main(String[] args) {
        List<Person> person = new ArrayList<>();

        person.add(new Person("Jada", "Smith", 25));
        person.add(new Person("kaleab", "Johnson", 52));
        person.add(new Person("maalik", "Brown", 41));
        person.add(new Person("brendon", "Davis", 14));
        person.add(new Person("latel", "Wilson", 26));
        person.add(new Person("Atum", "Miller", 62));
        person.add(new Person("jennifer", "Moore", 50));
        person.add(new Person("jameson", "Taylor", 5));
        person.add(new Person("Daniel", "Anderson", 34));
        person.add(new Person("Alana", "Thomas", 43));

        Scanner myScanner = new Scanner(System.in);

        System.out.print("please enter a first or last name ");
        String Name = myScanner.nextLine();

        List<Person> matchingPeople = new ArrayList<>();

        for (Person persons : person) {
            if (persons.getFirstName().equalsIgnoreCase(Name)
                    || persons.getLastName().equalsIgnoreCase(Name)) {

                        matchingPeople.add(persons);
            }
        }
        System.out.println("Search results ");

        if (matchingPeople.isEmpty()) {
            System.out.println("No matching people were found ");
        } else {
            for (Person persons : matchingPeople) {
                System.out.println(
                        persons.getFirstName() + " " +
                                persons.getLastName()
                                + " age " + persons.getAge()
                );
            }
        }
        int total = 0;

        for (Person persons : person) {
            total += persons.getAge();
        }
        BigDecimal averageAge = BigDecimal.valueOf(total / person.size());

        int oldestAge = person.get(0).getAge();
        int youngestAge = person.get(0).getAge();

        for (Person persons : person) {
            int currentAge = persons.getAge();

            if (currentAge > oldestAge) {
                oldestAge = currentAge;
            }
            if (currentAge < youngestAge) {
                youngestAge = currentAge;
            }
        }
        System.out.println("Average age " + averageAge);
        System.out.println("Age of oldest person  " + oldestAge);
        System.out.println("Age of youngest person  " + youngestAge);


    }
}
