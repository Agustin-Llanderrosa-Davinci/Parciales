import java.util.ArrayList;

public class Estudiante extends Usuario{


    //atributos//
   private String carrera;
   private ArrayList<String> materiasAprobadas = new ArrayList<String>(3);
   private ArrayList<String> materiasInscriptas = new ArrayList<String>(2);


    //constructor//
    public Estudiante(int dni, String nombre, String apellido, String carrera) {
        super(dni, nombre, apellido);
        this.carrera= carrera;
    }


    //getters y setters//

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public ArrayList<String> getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public void setMateriasAprobadas(ArrayList<String> materiasAprobadas) {
        this.materiasAprobadas = materiasAprobadas;
    }

    public ArrayList<String> getMateriasInscriptas() {
        return materiasInscriptas;
    }

    public void setMateriasInscriptas(ArrayList<String> materiasInscriptas) {
        this.materiasInscriptas = materiasInscriptas;
    }


    //metodos//
    public String imprimirMateriasAprobadas() { return "Materias aprobadas "+materiasAprobadas;}
    public String imprimirMateriasInscriptas() { return "Materias inscriptas "+materiasInscriptas;}
}




