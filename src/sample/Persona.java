package sample;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Persona {

    private String nombre;
    private String apellido;
    private int edad;


    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    private static Persona lista[] = {
            new Persona("david", "Delcid", 20),
            new Persona("Israel", "Delcid", 20),
            new Persona("Fernando", "Papus", 20),
            new Persona("John", "Almuerza", 20),
            new Persona("Dagoberto","ribera",90),
            new Persona("Isabel","arriaza",78)


    };

    public static void buscar(){
    }


    public static void getLista(){
        for(int b=0;b<lista.length;b++){
            System.out.println(lista[b].nombre+" "+lista[b].apellido+" "+lista[b].edad);
        }

    }


    public static String buscarNombre(String busqueda) {
        String persona="";
        for (int a = 0; a < lista.length; a++) {

            Pattern valida = Pattern.compile(busqueda,Pattern.DOTALL);
            Matcher comprobacion = valida.matcher(lista[a].nombre + " " + lista[a].apellido);
            if (comprobacion.find()) {
                persona+=lista[a].nombre+" "+lista[a].apellido+" "+lista[a].edad+"\n";

            }
        }
        return persona;
    }
}
