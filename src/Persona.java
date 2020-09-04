import java.util.ArrayList;
import java.util.List;

public class Persona {
    String nombre;
    public Persona(String n){
        nombre=n;
    }
    public String hablar() {
        return "";
    }
    public void respirar(){
    }

    public String trabajar (){
        return "";
    }
}

class Profesor extends Persona{
    public Profesor(String n) {
        super(n);
    }

    public String trabajar(){
        return "Enseñar a alumnos";
    }
}

class Conductor extends Persona{
    public Conductor(String n) {
        super(n);
    }

    public String trabajar (){
        return "Transportar personas";
    }
}

class Solucion {
    public static void main(String []args){
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Pepito"));
        personas.add(new Profesor("carlitos" + "Profesor"));
        personas.add(new Conductor("Menganito" + "Conductor"));
        personas.forEach(p->{
           System.out.println(p.nombre + " es "+ p.trabajar());
        });
    }
}
