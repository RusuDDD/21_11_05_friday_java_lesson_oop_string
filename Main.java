package de.telran;

public class Main {

    public static void main(String[] args) {
    //create an instance of the class Human

        Humman petya = new Humman("Petya", "Petin", 25 ,false);
        Humman petya1 = new Humman("Grisha", "Petin", 25 ,false);
        Humman petya2 = new Humman("Vanea", "Petin", 55,false);
        Humman petya3 = new Humman("Jon", "Petin", 22,false);
        Humman petya4 = new Humman("Patrik", "Petin", 45, false);
        Humman petya5 = new Humman("Sasha", "Petin", 79, true);
        Humman petya6 = new Humman("Tolea", "Petin", 35,false);
        Humman petya7 = new Humman("Vlad", "Petin", 52,false);
        Humman vasya8 = new Humman("Vasya" ,"Vasin" ,20,false);
        Humman vasya9 = new Humman("Vasya" ,"Vasin" ,20,false);

        vasya8.introduce();
        vasya9.introduce();
        petya.introduce();
        petya1.introduce();
        petya2.introduce();
        petya3.introduce();
        petya4.introduce();
        petya5.introduce();
        petya6.introduce();
        petya7.introduce();


        System.out.println(Humman.getHumanNumber());
        System.out.println(Humman.getMidAge());
    }
}
