import java.util.Scanner;

public class RetoNueve {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner (System.in);
        /*int T = scn.nextInt();
        String p="";
        while(scn.hasNextLine()) {
                p = scn.next();
        }
        for (int i =1; i<=T; i++){
            System.out.println(i +" "+ p);
        }*/
        for(int i=1; scn.hasNext(); i++){
            String p= scn.nextLine();
            System.out.println(i + " " + p);
        }
        scn.close();
    }
}
