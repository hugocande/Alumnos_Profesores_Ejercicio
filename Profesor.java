public class Profesor {

    private String nombre;
    private int edad;
    private char sexo;
    private String materia;

    public Profesor (String nombre, int edad, char sexo, String materia){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.materia = materia;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return edad;
    }

    public void setSexo(char sexo){
        this.sexo = sexo;
    }
    public char getSexo(){
        return sexo;
    }

    public void setMateria(String materia){
        this.materia = materia;
    }
    public String getMateria(){
        return materia;
    }

    public boolean estaDisponible(){
        int numero = (int)(Math.random()*10+1);
        if (numero == 1 || numero == 2){
            System.out.println("El profesor no está disponible");
            return false;

        }else
            return true;
    }
}
