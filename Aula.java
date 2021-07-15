public class Aula {

    public int id;
    public int numMax;
    public String materia;
    Profesor profesor;
    Alumno [] alumnos = new Alumno[numMax];
    private boolean claseDisponible = false;

    public Aula (int id, int numMax, String materia, Profesor profesor, Alumno [] alumnos ){

        this.id = id;
        this.numMax = numMax;
        this.materia = materia;
        this.profesor = profesor;
        this.alumnos = alumnos;
    }

    public void aulaDisponible() {
        if (profesor.estaDisponible() && profesor.getMateria() == materia) {
            int contador = 0;
            for (int i = 0; i<alumnos.length;i++){
               if(alumnos[i].estaDisponible());
               contador++;
           }
            if (contador/numMax <2){
                claseDisponible = true;
                System.out.println("Se puede dar clase.");
            }
        }

    }

    public void darClase(){
        if (claseDisponible){
            int chicas = 0;
            int chicos = 0;
            for (int i = 0; i<alumnos.length; i++){
                if(alumnos[i].getSexo() == 'H' && alumnos[i].getCalificacion()>=5){
                    chicos++;
                }
                if(alumnos[i].getSexo() == 'M' && alumnos[i].getCalificacion()>=5){
                    chicas++;
                }
            }
            System.out.println("Han aprobado " + chicos +" chicos y " + chicas +" chicas.");
        } else System.out.println("No se puede dar clase.");
    }
}
