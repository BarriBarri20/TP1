import java.util.*;
public class Phrase {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String[] arrOfStr = str.split(" ");
        System.out.println("");
        for ( int i = 0; i < arrOfStr.length; i++) {
            System.out.print(arrOfStr[i].charAt(0)+"");
        }
        for ( int i = 0; i < arrOfStr.length; i++) {
            System.out.print(arrOfStr[i].length()+"");
        }
        
    }
}
