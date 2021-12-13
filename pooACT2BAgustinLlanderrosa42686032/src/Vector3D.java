public class Vector3D {

    //atributos
    Punto3D puntoInicial;
    Punto3D puntoFinal;

    //constructor
    public Vector3D(Punto3D puntoInicial, Punto3D puntoFinal) {
        this.puntoInicial = new Punto3D(0, 0, 0);
        this.puntoFinal = puntoFinal;
    }

    public Vector3D(Punto3D puntoFinal) {
        this.puntoFinal = puntoFinal;
        this.puntoInicial = new Punto3D();
    }

    //metodos
    public double magnitudVector(){
        return Math.sqrt(Math.pow(puntoFinal.x-puntoInicial.x,2) + Math.pow(puntoFinal.y-puntoInicial.y,2) + Math.pow(puntoFinal.z-puntoInicial.z,2));
    }

    public void mostrarComponentes() {

        System.out.println(puntoInicial.x-puntoFinal.x);
        System.out.println(puntoInicial.y- puntoFinal.y);
        System.out.println(puntoInicial.z- puntoFinal.z);
    }

    @Override
    public String toString() {
        return "El Vector comienza en el puntoInicial=" + puntoInicial + ",y termina en el puntoFinal=" + puntoFinal + '}';


    }
}

