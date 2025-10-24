package exercicios.exe017;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Integer> vetor = new ArrayList<Integer>();

        for (int i = 1; i <= 10; i++) {
            vetor.add((int)(Math.random() * 10));
        }

        int pares = 0;
        int impares = 0; 
        for (int i = 1; i < vetor.size(); i++) {
            if (vetor.get(i) % 2 == 0) {
                System.out.println(vetor.get(i));
                pares ++;
                
            } else {
                System.out.println(vetor.get(i));
                impares ++;
            }
        }

        System.out.println("Existem " + pares + " nª pares");
        System.out.println("Existem " + impares + " nª impares");


    


    }
}
