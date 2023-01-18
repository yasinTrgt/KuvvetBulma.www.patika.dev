import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int i ;

        Scanner sc = new Scanner(System.in);
        System.out.print("Sınır Sayısını Girin : ");
        i = sc.nextInt();

        System.out.println("4ün Kuvvetleri ");
        for(int n = 1 ; n <= i; n*=4 ){
            System.out.println(n + " ");
        }
        System.out.println("\n5ün Kuvvetleri ");
        for( int j = 1 ; j <= i ; j*=5){
            System.out.println(j + " ");
        }


    }
}
