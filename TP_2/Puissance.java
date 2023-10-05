import java.util.Scanner;
public class Puissance {
    public static void main(String[]args)
    {
        Scanner sa  = new Scanner(System.in);
        System.out.println("Veuillez entrer une valeur: ");
        int elemnt_a_diviser = sa.nextInt();
        System.out.println("Puissance combien: ");
        int n = sa.nextInt();
        double resultat = Pow_1(elemnt_a_diviser,n);
        double resultat_2 = Pow_2(elemnt_a_diviser,n);
        System.out.println("Resultat: "+resultat);
        System.out.println("Resultat avec la recursivite: "+resultat_2);

    }
    public static double Pow_1(int a , int n)
    {
        int init = 1;
        double e;
        if(n<0)
        {
            e = 1/ a * n;
            return e; 
        }
        for(int i = n ; i>  0; i--)
        {
            init *= a;
        }
        return init;
    }
    public static double Pow_2(int a ,int n)
    {
        if(n<0)
        {
            return 1 / Pow_2(a, -n);
        }
        if(n==0)
        {
            return 1;
        }
        else
        {
            return a * Pow_2(a,n-1);
        }
    }
}

