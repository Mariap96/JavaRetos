public class Cycle {
    String define_me(){
        return "a vehicle with pedals.";
    }

    String prueba(){
        return "esto es una prueba";
    }

}
class C extends Cycle{

}
class MotorCycle extends Cycle{
    String define_me(){
        return "a cycle with an engine.";
    }

    MotorCycle(){
        System.out.println("Hello I am a motorcycle, I am "+ define_me() + prueba());

        String temp=super.define_me(); //Fix this line

        System.out.println("My ancestor is a cycle who is "+ temp );
    }

}
class Solution{
    public static void main(String []args){
        Object M=new MotorCycle();
        System.out.println("Impresion" + (M instanceof MotorCycle));
        System.out.println("Impresion" + (M instanceof Cycle));
        System.out.println("Impresion" + (M instanceof C));
        System.out.println(((MotorCycle)M).define_me());
        System.out.println(((Cycle)M).define_me());
        if (M instanceof C)
        System.out.println(((C)M).define_me());
    }
}
