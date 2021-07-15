/*
EJercicio 3.

Queremos representar con programación orientada a objetos, un aula con estudiantes y un profesor.

Tanto de los estudiantes como de los profesores necesitamos saber su nombre, edad y sexo.
De los estudiantes, queremos saber también su calificación actual (entre 0 y 10)  y del profesor que materia da.

Las materias disponibles son matemáticas, filosofía y física.

Los estudiantes tendrán un 50% de hacer novillos,
por lo que si hacen novillos no van a clase pero aunque no vayan quedara registrado en el aula (como que cada uno tiene su sitio).

El profesor tiene un 20% de no encontrarse disponible (reuniones, baja, etc.)

Las dos operaciones anteriores deben llamarse igual en Estudiante y Profesor (polimorfismo).

El aula debe tener un identificador numérico, el número máximo de estudiantes y  para que esta destinada
(matemáticas, filosofía o física). Piensa que más atributos necesita.

Un aula para que se pueda dar clase necesita que el profesor esté disponible,
que el profesor de la materia correspondiente en el aula correspondiente
(un profesor de filosofía no puede dar en un aula de matemáticas) y que haya más del 50% de alumnos.

El objetivo es crear un aula de alumnos y un profesor y determinar si puede darse clase, teniendo en cuenta las condiciones antes dichas.

Si se puede dar clase mostrar cuantos alumnos y alumnas (por separado) están aprobados de momento (imaginad que les están entregando las notas).

NOTA: Los datos pueden ser aleatorios (nombres, edad, calificaciones, etc.) siempre y cuando tengan sentido (edad no puede ser 80 en un estudiante o calificación ser 12).
*/

public class Main {

    public static void  main (String [] args){

        Profesor profesor1 = new Profesor("Antonio", 45,'H', "Filosofía");

        Alumno alumno1 = new Alumno("Andrés", 16, 'H',5.5);
        Alumno alumno2 = new Alumno("Carlos", 16, 'H',3.5);
        Alumno alumno3 = new Alumno("Marcos", 16, 'H',7.5);
        Alumno alumna1 = new Alumno("Sara", 16, 'M',5.5);
        Alumno alumna2 = new Alumno("Cristina", 16, 'M',9.5);
        Alumno alumna3 = new Alumno("Turbi", 16, 'M',2.5);

        Alumno [] alumnos = new Alumno[] {alumno1,alumno2,alumno3,alumna1,alumna2,alumna3};

        Aula aula1 = new Aula(1,6,"Filosofía", profesor1,alumnos);

        aula1.aulaDisponible();
        aula1.darClase();




    }
}
