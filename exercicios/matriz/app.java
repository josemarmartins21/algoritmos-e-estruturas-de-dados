package matriz;

public class app {
    public static void main(String[] args) {
        int matriz[][] = new int[2][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length + 1; j++) {
                matriz[i][j] = (int)(Math.random() * 20); 
            }
        } 


        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length + 1; j++) {
                System.out.print(matriz[i][j] + "\t"); 
            }
            System.out.println();
        } 
    }
}
