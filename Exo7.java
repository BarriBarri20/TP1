import java.util.*;
public class Exo7 {
    static boolean estPalindrome(String s){
        {
            int i = 0;
            int j = s.length() - 1;
            while ( i < j ) {
                if ( s.charAt(i) != s.charAt(j) ) {
                    return false;
                }
                i++;
                j--;
            }
            return true;
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Entrer la taille de tableau a saisir : ");
        int n = s.nextInt();  
        
        String[] arrOfWords = new String[n];
        Boolean[] arrOfTests = new Boolean[n];

        for (int i = 0; i < n; i++){
            System.out.println("Entrer la chaine numero"+i);
            arrOfWords[i] = s.next(); 
        }
        for ( int i = 0; i < n; i++){
            arrOfTests[i] = estPalindrome(arrOfWords[i]);
        }
        System.out.println("*********");
        for ( int i = 0; i < n; i++){
            System.out.print(arrOfTests[i]+"|");
        }
    }
}