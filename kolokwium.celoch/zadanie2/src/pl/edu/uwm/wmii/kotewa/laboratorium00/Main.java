package pl.edu.uwm.wmii.kotewa.laboratorium00;
import java.util.Scanner;
import java.util.Random;
import java.lang.Math.*;
public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Random r = new Random();
        int[] a = new int[n];
        int ile=0;
        for(int i = 0 ; i<=n-1;i++)
        {
            a[i] = r.nextInt(100)-50;
            System.out.println(a[i]);
        }
        int min=a[0];
        for(int j=0;j<n-1;j++)
        {
            if(a[j]<min)
            {
                min=a[j];
            }
        }
        for(int k=0;k<n-1;k++)
        {
            if(a[k]==min)
                ile++;
        }
        System.out.println('\n');
        System.out.println(min);
        System.out.println(ile);
    }
}
