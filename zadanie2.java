package pl.edu.uwm.wmii.kordowskijakub.kolokwium01;
import java.util.Scanner;
import java.util.Random;

public class zadanie2 {

    public static void main(String[] args) {
        Random r = new Random();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] tab = new int[n];
        for(int i=0;i<n;i++){
            tab[i] = r.nextInt(101)-50;
            System.out.print(tab[i]+" ");
        }
        int maxCount = 0;
        int currentCount = 0;
        int count = 0;
        int pom = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(tab[j]==tab[i]) currentCount+=1;
            }
            if(currentCount>maxCount){
                maxCount = currentCount;
                pom = tab[i];
                currentCount = 0;
            }
            else{
                currentCount = 0;
            }
        }
        for(int i=0;i<n;i++){
            if(tab[i]==pom) count+=1;
        }
        System.out.print("\n");
        System.out.println("Najczesciej wystepujaca liczba: "+pom+" wystepuje "+maxCount+" razy.");
    }
}
