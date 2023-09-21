import java.util.Scanner;

public class PromediosAlumnos {
    public static void main(String[] args) {
        //Declaración de variables
        int[] calif = new int[5];
        String nombreAlumno = "";
        float prom = 0;
        char letra = ' ';

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca nombre alumno: ");
        nombreAlumno = teclado.nextLine();

        //Leemos las calificaciones
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduzca la calificación de la materia " + (i+1) + ":");
            calif [i]=teclado.nextInt();
        }

        prom=promedio(calif);
        letra=calificacion(prom);
        ImprimeCalificaciones(nombreAlumno, calif,prom, letra);

    }

    //Método que hace el promedio
    public static float promedio(int[] p_calif){
       float result = 0;
        for (int i = 0; i < 5; i++) {
           result = result+p_calif[i];
        }
        result = result/5;
        return result;
    }

    //Método que da la calificación
    public static char calificacion(float p_promedio){
       char result = ' ';
        if (p_promedio <= 50){
           result = 'F';
        }
        if (p_promedio>50 && p_promedio<=60){
            result = 'E';
        }
        if (p_promedio>60 && p_promedio<=70){
            result = 'D';
        }
        if (p_promedio>70 && p_promedio<=80){
            result = 'C';
        }
        if (p_promedio>80 && p_promedio<=90){
            result = 'B';
        }
        if (p_promedio>90 && p_promedio<=100){
            result = 'A';
        }
        if (p_promedio>100) {
            System.out.println("No se puede tener un promedio mayor a 100" +
                    "verifique las calificaciones");
            System.exit(0);
        }
        return result;
    }

    public static void ImprimeCalificaciones(String p_nombre, int[] p_calif,
                                             float p_promedio, char p_letra ){
        System.out.println("Las calificaciones de " +p_nombre);
        for (int i = 0; i < 5; i++) {
            System.out.println("La calificación "+(i+1) + " es: " + p_calif[i]);
        }
        System.out.println("El promedio es: " + p_promedio);

        System.out.println("La calificación es: " + p_letra);
    }
}