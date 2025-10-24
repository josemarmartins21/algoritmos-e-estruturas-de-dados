package exercicios.exe002;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int array[] = new int[5];
        int soma = 0;
        

        for (int i = 0; i < array.length; i++) {
            System.out.println("Type a number:" );
            array[i] = leitor.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            soma += array[i];
        }

        float media = (float)(soma / array.length);
        System.out.println("MEDIA: " + media);

    
        for (int i = 0; i < array.length; i++) {
            if (i < 1) {
                System.out.println("Values more big than averange");
            }
                
            if (array[i] > media) {
               
                System.out.println(array[i]);
            }
        }

        // System.out.println("Values low than averange");
        for (int i = 0; i < array.length; i++) {
            if (i < 1) {
                System.out.println("Values low than averange");
            }

            if (array[i] < media) {
               

                System.out.println(array[i]);

            }
        }

        leitor.close();


    }
}
