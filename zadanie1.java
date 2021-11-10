package pl.edu.uwm.wmii.kordowskijakub.kolokwium01;
import java.util.Scanner;

public class zadanie1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] tab = new int[n];
        for(int i=0;i<n;i++){
            tab[i] = in.nextInt();
        }
        int[] a = showPrimes(tab);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }

    public static int[] showPrimes(int[] list){

        int count = 0;
        int counter = 0;
        int ile = 0;
        for(int i=0;i<list.length;i++){
            if(list[i]==0 || list[i]==1);
            else{
                for(int j=2;j<=list[i]/2;j++){
                    if(list[i]%j==0) count+=1;
                }
                if(count==0){
                    ile+=1;
                }
                else{
                    count = 0;
                }
            }
        }
        count = 0;
        int[] wynik = new int[ile];
        for(int i=0;i<list.length;i++){
            if(list[i] == 0 || list[i] == 1);
            else{
                for(int j=2;j<=list[i]/2;j++){
                    if(list[i]%j==0) count+=1;
                }
                if(count==0){
                    wynik[counter] = list[i];
                    counter+=1;
                }
                else{
                    count = 0;
                }
            }
        }
        return wynik;
    }
}
