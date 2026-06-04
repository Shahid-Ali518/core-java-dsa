package streamapi;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Person{
    private String name;
    private String address;
    private String phoneNumber;

    public String getName(){
        return this.name;
    }

    public String getAddress(){
        return this.address;
    }

    public Person(String name, String address, String phoneNumber){
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public Person(String name, String address){
        this.name  =name;
        this.address = address;
    }


}
public class MapStreamExample {

    public static void main(String[] args) {

        ArrayList<Person> persons = new ArrayList<>();

        persons.add(new Person("shahid", "Lahore","3333333"));
        persons.add(new Person("mustafa", "Karachi","324828323"));
        persons.add(new Person("arshad", "Multan","4332324232"));
        persons.add(new Person("usman", "Lahore","323234412"));

        Stream<Person> mappedPerson = persons.stream()
                .map(p -> new Person(p.getName(), p.getAddress()));

        List<Person> list = mappedPerson
                .collect(Collectors.toList());


        System.out.println(list);

        for(Person p: list)
            System.out.println("Name: " + p.getName() + "\t\tAddress: " + p.getAddress());

//        mappedPerson.forEach(p -> System.out.println("Name: " + p.getName() + " Address: " + p.getAddress()));

        // usage of iterator with stream
        Stream<Person> stream = persons.stream();
        Iterator<Person> iterator = stream.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }


}
