import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

class LibretaDeNotas {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        // System.out.println("cuantos alumnos son: ");
        // Integer alumnos = scnr.nextInt();
      //  System.out.println("menu ");
      //  Integer menu = scnr.nextInt();
        System.out.println("Introduzca el nombre");
         String alumno = scnr.nextLine();


            System.out.println("coloque su nota de matematicas");
            Integer notaM = scnr.nextInt();

            System.out.println("coloque su nota de lenguaje");
            Integer notaL = scnr.nextInt();

            System.out.println("coloque su nota de ingles");

        Integer notaI = scnr.nextInt();
        Integer promedio = notaM + notaL + notaI;
        Integer notaF = promedio / 3;

        if (notaF >= 11) {
            System.out.println("nota invalida");
        } else if (notaF == 10) {
            System.out.println("Nota exelente! felicidades " + alumno);
        } else if (notaF >= 8) {
            System.out.println("usted " + alumno + ", Aprobo perfectamente");
        } else if (notaF >= 5) {
            System.out.println("usted " + alumno + ", Aprobo aceptable");
        } else if (notaF >= 3) {
            System.out.println("usted " + alumno + " fue Insuficiente");
        } else if (notaF >= 1) {
            System.out.println("usted " + alumno + ", Reprobo");
        } else {
            System.out.println("Nota Valido");
        }
    }
}

        //  HashMap<String, String> Calificaciones = new HashMap<>();


//-- evaluar las calificaciones de un estudiante para tres materias distintas
//-- pedir que ingrese calificacion de estudiante por cada materia y guardar cada valor en su variable
//-- usar "if" "else if" "else" para determinar y mostrar la calificacion final correspondiente segun las siguientes conficiones
//-- No aprovado si es igual o menor que 3
//-- insuficiente si es mayor que 3 pero menor o igual que 5
//-- aceptable mayor de 5 menor o igual 8
//-- exelente si es un 10
//--invalido fuera de |0-10|

//-- pedir nombre
// pedir cantidad de alumnos y notas por alumno
//-- renombrar clase Evaluador a LibretaDeNotas
// utilizar HashMap para almacenar las calificaciones donde la llave es el nombre del estudiante
// nombre de alumnos y notas almacenando en Hashmap
// utilizar bucles (for, for each) para recorrer el hashmap de calificaciones
// -- calcular promedio
// mostrar mejor nota y peor en lista Arraylist
// menu con 1-mostrar el promedio de notas por estudiante
//          2-mostrar si la nota es aprobatoria o reprobatoria por estudiante
//          3-mostrar si la nota esta por sobre o por debajo del promedio del curso
//          0-salir del menu
// utilizar un bucle para permitir al usuario seleccionar hasta apretar 0 para salir
// menu funciones
//  1 muestra el promedio de notas de cada alumno guardado por separado
//  2 solicita al usuario ingresar el nombre de un estudiante y una nota, luego verifica si es aprobatoria o no segun una nota de aprobacion definida
//  3 solicita al usuario ingresar el nombre de un estudiante y una nota, luego verifica si esta por sobre o debajo del promedio general
//  0 cerrar el programa
// implementar validaciones para asegurar que las notas ingresadas esten en un rango valido

