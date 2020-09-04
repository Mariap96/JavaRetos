import java.util.*;
import java.util.stream.Collectors;

class Student{}
class Rockstar{   }
class Hacker{}

public class RetoDieciseis {
    static String count(ArrayList mylist) {
        int a = 0, b = 0, c = 0;
        for (int i = 0; i < mylist.size(); i++) {
            Object element = mylist.get(i);
            if (element instanceof Student)
            a++;
            if (element instanceof Rockstar)
            b++;
            if (element instanceof Hacker)
            c++;

        }
       // var pruebaGrouping = mylist.stream().collect(Collectors.groupingBy(f->f.getClass().getCanonicalName()));
        Map<String, List<Object>> pruebaGrouping = (Map<String, List<Object>>) mylist.stream().collect(Collectors.groupingBy(f->f.getClass().getCanonicalName()));
        System.out.print(pruebaGrouping);
        ((HashMap)pruebaGrouping).entrySet().stream().forEach(e->System.out.println(e));
        pruebaGrouping.entrySet().stream().forEach(e->System.out.println(e.getKey()+": "+e.getValue().size()));
        String ret = Integer.toString(a) + " " + Integer.toString(b) + " " + Integer.toString(c);
        return ret;
    }
    public static void main(String []args){
        ArrayList mylist = new ArrayList();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++){
            String s=sc.next();
            if(s.equals("Student"))mylist.add(new Student());
            if(s.equals("Rockstar"))mylist.add(new Rockstar());
            if(s.equals("Hacker"))mylist.add(new Hacker());
        }
        System.out.println(count(mylist));
    }
}
