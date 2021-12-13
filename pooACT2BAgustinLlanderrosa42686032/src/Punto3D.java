public class Punto3D {

    //atributos//
    double x;
    double y;
    double z;

    //constructores//

    public Punto3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Punto3D(double w) {
        this.x = w;
        this.y = w;
        this.z = w;
    }

    public Punto3D() {
    }

    //metodos
    public double distanciaDesdeOrigen(){
        return Math.sqrt(Math.pow(this.x,2) + Math.pow(this.y,2) + Math.pow(this.z,2));
    }

    public double distanciaDesdeOtroPunto(double x, double y, double z){
        return Math.sqrt(Math.pow(this.x-x,2) + Math.pow(this.y-y,2) + Math.pow(this.z-z,2));
    }

    public double distanciaDesdeOtroPunto(Punto3D otroPunto){
        return Math.sqrt(Math.pow(this.x-otroPunto.x,2) + Math.pow(this.y-otroPunto.y,2) + Math.pow(this.z-otroPunto.z,2));
    }

    @Override
    public String toString() {
        return "x=" + x +  ", y=" + y + '}';
    }
}

