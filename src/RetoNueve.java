import java.util.Scanner;

public class RetoNueve {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner (System.in);
        String p="";
        int i =1;
        while(scn.hasNext()) {
            p = scn.nextLine();
            System.out.println(i +" "+ p);
            i++;
        }

         do {
            p = scn.nextLine();
            System.out.println(i +" "+ p);
            i++;
        }while(scn.hasNext());

       /* for(int i=1; scn.hasNext(); i++){
            String p= scn.nextLine();
            System.out.println(i + " " + p);
        }
        for (;scn.hasNextLine();){

        }*/
        scn.close();
    }
}
