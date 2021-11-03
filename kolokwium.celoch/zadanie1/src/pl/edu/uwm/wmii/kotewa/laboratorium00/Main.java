package pl.edu.uwm.wmii.kotewa.laboratorium00;
import java.util.Scanner;
import java.lang.Math.*;
public class Main {
    public static int findPrimes(int[] list)
    {
        int ile=0;
        for(int i=0;i<list.length-1;i++)
        {
            int czypierwsza=0;
            for(int j=1;j<=Math.sqrt(list[i]);j++)
            {
                if(list[i]%j==0)
                {
                    czypierwsza++;
                }

            }
            if(czypierwsza == 1)
            {
                ile++;
            }
        }
        return ile;
    }
    public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    int n = s.nextInt();
	    int[] tab = new int[n];
	    for(int i=0;i<=n-1;i++)
        {
            tab[i]=s.nextInt();
            System.out.println(tab[i]);
        }
        System.out.println(findPrimes(tab));
    }
}
