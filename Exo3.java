import java.util.*;

public class Exo3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Entrer dans l'ordre votre Prenom, poids et taille : ");
        String prenom = s.next();
        Double poids = s.nextDouble();
        Double taille = s.nextDouble();
        Double IMC = poids / Math.pow(taille, 2);
        if ( IMC < 18.5 ) {
            System.out.println("insuffisance pondérale");
        } else if ( ( IMC >= 18.5 ) && ( IMC < 25 ) ) {
            System.out.print("poids normal");
        } else if ( ( IMC >= 25 ) && ( IMC < 30 ) ){
            System.out.print("surpoids");
        } else if ( IMC >30 ) {
            System.out.print("obésité");
        }
    }
}
