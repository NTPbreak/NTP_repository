import java.util.Scanner;

public class Nbre_premiers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Veuillez entrer un nombre: ");
        String n = scan.nextLine();
        int nbr = Integer.parseInt(n);
        int reponse = NbrPremiers(nbr);
        if (reponse == 0) {

            System.out.println("Le nombre " + nbr + " n'est pas premier");
        } else {
            System.out.println("Le nombre " + nbr + " est premier");
        }
    }

    public static int NbrPremiers(int nbr) {
        int nbr_de_division = 0;
        for (int i = nbr; i > 0; i--) {
            if (nbr % i == 0) {
                nbr_de_division++;
            }
        }
        if (nbr_de_division > 2) {
            return 0;
        } else {
            return 1;
        }
    }

    

}