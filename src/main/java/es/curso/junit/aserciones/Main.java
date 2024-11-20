package es.curso.junit.aserciones;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Primitivos
        int a = 5;
        int b = 5;

        System.out.println("Primitivos-> "+(a==b  ));

        //Objetos
        Persona persona1 = new Persona("Paco","Reyes");
        Persona persona2 = new Persona("Paco","Reyes");

        System.out.println("Objetos-> " + (persona1.equals(persona2)));
//        boolean respuesta = persona1 == persona2;
//        System.out.println(respuesta);




    }
}