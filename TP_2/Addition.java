import java.util.Scanner;

public class Addition {
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Veuillez entrer deux nombres entiers: ");
        int nb1 = Integer.parseInt(scan.nextLine());
        int nb2 = Integer.parseInt(scan.nextLine());
        int somme = add(nb1, nb2);
        System.out.println("Somme de "+nb1+" et "+nb2+" = "+somme);
    }
    public static int add(int a, int b) {
        return a + b;
    }
}

