package org.example;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//tworzenie obiektów klasy aktor
// zrób dwa obiekty
        Actor angelinaJolie = new Actor("Angelina", "Jolie", 3, false);
        Actor bratPitt = new Actor("Brad", "Pitt", 5, true);
        int salaryAngelina;
        salaryAngelina = angelinaJolie.calculateSalary(5,10000);
        System.out.println(salaryAngelina);
        int salaryPitt;
        salaryPitt = bratPitt.calculateSalary(10, 50000);
        System.out.println(salaryPitt);

        List<Actor> actors = new ArrayList<>();
                actors.add(angelinaJolie);
                actors.add(bratPitt);

        for (Actor actor : actors) {
            System.out.println(actor.calculateSalary(5, 1000));

        }

//        Scanner scanergreets = new Scanner(System.in);
//        String imieAktora;
//        System.out.println("Witej Ziom - daj swoje imię");
//        imieAktora = scanergreets.nextLine();
//        if (imieAktora.equals("Angelina")) {
//            System.out.println("Włazi");
//        } else if (imieAktora.equals("Brad")) {
//            System.out.println("Wchodzi Brad robimy WOW");
//        } else if (imieAktora.equals("Donald")) {
//            System.out.println("Pa Pa");
//
//        }
//
//        System.out.println("Rating Brada to " + bratPitt.getRating());
//        System.out.println(bratPitt);
//
//        Movie matrix = new Movie("Matrix", 1996, 3);
//        Movie topGun = new Movie("Top Gun", 1994, 5);
//
//        if (matrix.getRating() <= topGun.getRating()) {
//            System.out.println("Matrix jest popularniejszym filmem");
//        } else {
//            System.out.println("Top Gun jest popularniejszym filmem");
//        }
//        int age = 101;
//        String imie = "Michal";
//        String aktorka = "Angelina";
//        System.out.println(imie + " i " + aktorka + " to dobrzy znajomi");
//        System.out.println(age + " ona ma tyle lat");
//
//        String imieKlientki;
//        System.out.println("Witam Panią");
//        System.out.println("Daj imię");
//        imieKlientki = scanergreets.nextLine();
//        System.out.println("Witam" + imieKlientki);

        //potrzebuje dwóch tablic

//        int ratings[] = new int[3];
//        String movies[] = new String[3];
//        movies[0] = "Matrix";
//        movies[1] = "Diuna";
//        movies[2] = "Pulp fiction";
//
//        System.out.println("oceń film");
//        Scanner scaner = new Scanner(System.in);
//        System.out.println("Jak oceniasz film " + movies[0]);
//        ratings[0] = scaner.nextInt();
//        System.out.println("Jak oceniasz film " + movies[1]);
//        ratings[1] = scaner.nextInt();
//        System.out.println("Jak oceniasz film " + movies[2]);
//        ratings[2] = scaner.nextInt();
//
//        System.out.println("Film " + movies[0] + "Twoja ocena " + ratings[0]);
//        System.out.println("Film " + movies[1] + "Twoja ocena " + ratings[1]);
//        System.out.println("Film " + movies[2] + "Twoja ocena " + ratings[2]);
//    List<String> movies = new ArrayList<>();
//    List<Integer> ratings = new ArrayList<>();
//    movies.add("Matrix");
//    movies.add("Diuna");
//    movies.add("Pulp Fiction");
//    Scanner scaner = new Scanner(System.in);
//    System.out.println("Jak oceniasz film " + movies.get(0));
//    ratings.add(scaner.nextInt());
//    System.out.println("Jak oceniasz film " + movies.get(1));
//    ratings.add(scaner.nextInt());
//    System.out.println("Jak oceniasz film " + movies.get(2));
//    ratings.add(scaner.nextInt());
//    System.out.println("Podsumowanie Twojego rankingu: ");
//    System.out.println("Film: " + movies.get(0) + " oceniłeś na: " + ratings.get(0));
//    System.out.println("Film: " + movies.get(1) + " oceniłeś na: " + ratings.get(1));
//    System.out.println("Film: " + movies.get(2) + " oceniłeś na: " + ratings.get(2));


//        Scanner scaner = new Scanner(System.in);
//        System.out.println("Podaj liczbę sekund od 1 do 10");
//        int sekundy;
//        sekundy = scaner.nextInt();
//        for (int i = sekundy; i >= 1; i--) {
//            System.out.println("Bomba wybucha za...");
//            System.out.println(i + "sekund ");
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//        System.out.println("JEBUUUT");

//        List<String> movies = new ArrayList<>();
//        movies.add("Matrix");
//        movies.add("Diuna");
//        movies.add("Pulp Fiction");
//        movies.add("Odyseja kosmiczna");
//        movies.add("Dijango");
//        System.out.println("Rozmiar listy to " + movies.size());
//        //wypisz wszystkie z listy
////        for (String movie : movies) {
////            System.out.println("Filmy na liście to " + movie);
//        for (int i = 0; i <= movies.size() - 1; i++)
//        System.out.println("Filmy to " + movies.get(i));
        }

}