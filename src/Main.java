public class Main {
    public static void main(String[] args) {

   Profesor profesor= new Profesor(100,"John","Doe");
   Estudiante estudiante= new Estudiante(42686032,"Agustin","Llanderrosa","Analista");
        System.out.println(profesor);
        System.out.println(estudiante);

   estudiante.getMateriasAprobadas().add("Sistemas empresariales");
   estudiante.getMateriasAprobadas().add("Poo");
   estudiante.getMateriasAprobadas().add("UX");
   System.out.println("Materias aprobadas"+estudiante.getMateriasAprobadas());

   estudiante.getMateriasInscriptas().add("Programacion web");
   estudiante.getMateriasInscriptas().add("Analisis matematico");
        System.out.println("Materias inscriptas"+estudiante.getMateriasInscriptas());

        estudiante.imprimirMateriasAprobadas();
        estudiante.imprimirMateriasInscriptas();



    }
}
