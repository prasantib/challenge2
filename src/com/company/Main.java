package com.company;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        int x = 5 + r.nextInt(4);
        for (int count = 1; count <= 25; count++) {
            ArrayList<String> ingredients = new ArrayList<>();
            String[] Rice = {"white", "brown", "no rice", "all"};
            String[] Meat = {"chicken", "steak", "carnidas", "chorizo", "sofritas", "veggies", "no meat", "all"};
            String[] Beans = {"pinto", "black", "no beans"};
            String[] Salsa = {"mild", "medium", "hot", "no salsa", "all"};
            String[] Veggies = {"lettuce", "fajita veggies", "no veggies", "all"};
            boolean cheese;
            boolean guac;
            boolean queso;
            boolean sourcream;

            if (x == 5) {
                System.out.println("Burrito " + count + ":" + " " +
                        Rice[0] + ", " + Meat[1] + ", " + Beans[2] + ", " + Salsa[0] + ", " + Veggies[3]);
            } else if (x == 6) {
                System.out.println("Burrito " + count + ":" + " " +
                        Rice[1] + ", " + Meat[2] + ", " + Beans[2] + ", " + Salsa[1] + ", " + Veggies[3]);
            } else if (x == 7) {
                System.out.println("Burrito " + count + ":" + " " +
                        Rice[2] + ", " + Meat[3] + ", " + Beans[0] + ", " + Salsa[2] + ", " + Veggies[1]);
            } else if (x == 8) {
                System.out.println("Burrito " + count + ":" + " " +
                        Rice[3] + ", " + Meat[4] + ", " + Beans[1] + ", " + Salsa[3] + ", " + Veggies[0]);
            } else {
                System.out.println("Burrito " + count + ":" + " " +
                        Rice[0] + ", " + Meat[5] + ", " + Beans[2] + ", " + Salsa[4] + ", " + Veggies[1]);
            }
        }
    }
}