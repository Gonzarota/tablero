import java.util.Scanner;

public class Tablero {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("De que tamaño quieres el tablero");
        int dimension= input.nextInt();
        for(int i=0; i<dimension;i++){
            if(i%2==0){
                for(int j=0; j<dimension;j++){
                    if(j%2==0){
                        System.out.print("#  ");
                    } else{
                        System.out.print("-  ");
                    }
                }
                System.out.println();
            }else{
                for(int k=0; k<dimension;k++){
                    if(k%2==0){
                        System.out.print("-  ");
                    } else{
                        System.out.print("#  ");
                    }
                }
                System.out.println();
            }
        }
    }
}
