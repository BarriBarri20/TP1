public class Exo2 {
    public static void main(String[] args){
        double x = Double.parseDouble(args[1]);
        double y = Double.parseDouble(args[2]);
        String a = "*";
        System.out.println("Votre fonction est : "+x+args[0]+y);
        if (  "+".equals(args[0]) ) {
            
            System.out.println(x+y);
        } else if ( "-".equals(args[0]) ) {
            System.out.print(x-y);
        } else if ( "-".equals(args[0]) ) {
            System.out.print(x-y);
        } else if ( "/".equals(args[0]) && y == 0 ) {
            System.out.print(" Devision par 0 !");
        } else if ( "/".equals(args[0]) ) {
            System.out.print(x/y);
        } else if ( a.equals(args[0]) ) {
            System.out.println(x*y);
        }
}
}