public class Alumno {

    private String nombre;
    private int edad;
    private char sexo;
    private double calificacion;


    public Alumno(String nombre, int edad, char sexo, double calificacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.calificacion = calificacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public char getSexo() {
        return sexo;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public boolean estaDisponible() {
        int numero = (int) (Math.random() * 10 + 1);
        if (numero > 5) {
            return true;
        } else return false;
    }

}
