package org.example.exercise1;
import java.util.ArrayList;
import java.util.List;

public class Person {

    private String name;
    private String document;
    private String address;
    private  int age;


    public Person(String name, String document, String address, int age) {
        this.name = name;
        this.document = document;
        this.address = address;
        this.age = age;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void mapMethod(){
        //Creacion de lista tipo Person
        List<Person> persons = new ArrayList<>();
        // Almacenamiento de los objetos en la lista
        persons.add(new Person("Pedro Perez", "CC-12345678", "Calle 21 #90-99", 25));
        persons.add(new Person("María López", "TI-87654321", "Avenida 10 #45-67", 30));
        persons.add(new Person("Juan González", "CE-98765432", "Carrera 5 #12-34", 40));

        //Nueva lista para almacenar los objetos de tipo persona almacenados en la lista anterior
        List<String> personInfoList = persons.stream()
                .map(person -> "Name: " + person.getName() +
                        ", Document: " + person.getDocument() +
                        ", Address: " + person.getAddress() +
                        ", Age: " + person.getAge() + " years")
                .toList();

        //Se imprime el contenido de la lista
        personInfoList.forEach(System.out::println);
    }


}
