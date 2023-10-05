import java.util.Scanner;
public class Factorielle {
    public static void main(String[]args)
    {
        System.out.println("Veuillez entrer un nombre: ");
        Scanner scan = new Scanner(System.in);
        int nbr = scan.nextInt();
        int resultat = factorielle(nbr);
        int resultat2 = factorielle_2(nbr);
        System.out.println("Factorielle fonction recursive de "+ nbr+" = "+resultat);
        System.out.println("Factorielle fonction iterative de "+ nbr+" = "+resultat2);
    }
    public static int factorielle(int nbr)
    {
        if(nbr == 1)
        {
            return nbr;
        }
        else
        {
            return nbr * factorielle(nbr-1);
        }
    }
    public static int factorielle_2 (int nbr)
    {
        int count = nbr-1;
        while(count != 1)
        {
            nbr*= count;
            count --;
        }
        return nbr;
    }
}
