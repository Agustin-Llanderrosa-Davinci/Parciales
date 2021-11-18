import java.util.ArrayList;

public class Profesor extends Usuario{


   //atributos//
  private ArrayList<String> comisiones = new ArrayList<String>();


   //constructor//
    public Profesor(int dni, String nombre, String apellido) {
        super(dni, nombre, apellido);
    }


    //getters y setters//
    public Profesor(int dni, String nombre, String apellido, ArrayList<String> comisiones) {
        super(dni, nombre, apellido);
        this.comisiones = comisiones;
    }


    //metodos//
    public String imprimirComisiones() { return "(Comisiones) "+imprimirComisiones();}








}
