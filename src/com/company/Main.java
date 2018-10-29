package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Pedimos la fecha en formato dia/mes/año por consola y asignamos cada uno a una variable.
        System.out.println("Introduzca el dia:\n");
        Scanner sc=new Scanner(System.in);
        int dia=sc.nextInt();
        System.out.println("Introduzca el mes:\n");
        int mes=sc.nextInt();
        System.out.println("Introduzca el año:\n");
        int año=sc.nextInt();
        //Boolean para imprimir la respuesta adecuada.
        boolean fecha=false;
        //If para comprobar si los datos introducidos estan dentro del rango aceptado.
        if (dia>0 && dia<=30){
            if (mes>0 && mes<=12){
                if (año>0){
                    fecha=true;
                }
            }
        }
        //Impresion en pantalla del resultado.
        if(fecha){
            System.out.println("La fecha introducida es correcta.");
        }else{
            System.out.println("La fecha introducida es incorrecta.");
        }
    }
}