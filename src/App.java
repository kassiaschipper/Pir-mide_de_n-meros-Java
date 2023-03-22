import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número para formar a pirâmide: ");

        int numero = in.nextInt();

       for(int i = 1; i<=numero; i++){
        String num = "";
        for (int j = 1; j<=i; j++){
            num+=i;
        }
        System.out.println(num); 
       }
}}
