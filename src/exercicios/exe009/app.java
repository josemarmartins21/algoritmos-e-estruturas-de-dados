package exercicios.exe009;

import java.util.Scanner;

public class app {
    public static void analisaAltura(int height, int heights[]) {
        int tot_mais_altos = 0, tot_mais_baixos = 0;
        for (int i = 0; i < heights.length; i++) {
            if (height > heights[i]) {
                tot_mais_baixos ++;
            } else {
                tot_mais_altos ++;
            }
        }

        System.out.println("Total de alunos mais baixos " + tot_mais_baixos );
        System.out.println("Total de alunos mais altos " + tot_mais_altos);
        
    }
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int []height = new int[20];

        for (int i = 0; i < height.length; i++) {
            height[i] = (int)(Math.random() * 30);
            System.out.println(height[i]);
        }

        System.out.println("Type the height of classmater");
        int newHeight = leitor.nextInt();

        analisaAltura(newHeight, height);

        int aux;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                if (height[i] > height[j]) {
                    aux = height[i];
                    height[i] = height[j];
                    height[j] = aux;
                }
            }
        }

        System.out.println("Array ordenado!");
        for (int i = 0; i < height.length; i++) {
            System.out.println(height[i]);
            if (i > 9) {
                System.out.println(newHeight);
                System.out.println("Fim");
                break;
            }
        }

        leitor.close();

        

    }
}
