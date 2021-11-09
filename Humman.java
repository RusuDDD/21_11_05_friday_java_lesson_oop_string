package de.telran;

public class Humman {

    public static int humanNumber = 0;
    public static double midAge = 0;

   private String name;
   private String surname;
   private int age;
   private boolean dying;

    public Humman(String name, String surname, int age, boolean dying) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.dying=dying;
        if (!dying)
            midAge = (midAge * humanNumber + age) / (++humanNumber);



    }

    public static int getMidAge() {
        return (int) midAge;
    }

    public static int getHumanNumber() {
        return humanNumber;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    void introduce() {
        if (age<50)
        System.out.println("Hi , my name is " + name + " " + surname + ". I am " + age + " years old");
        else
        System.out.println("Hello , my name is " + name + " " + surname + ". I am " + age + " years old");

    }
}
