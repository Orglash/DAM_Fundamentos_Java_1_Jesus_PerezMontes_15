package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Introduzca el dia:\n");
        Scanner sc=new Scanner(System.in);
        int dia=sc.nextInt();
        System.out.println("Introduzca el mes:\n");
        int mes=sc.nextInt();
        System.out.println("Introduzca el año:\n");
        int año=sc.nextInt();
        boolean fecha=false;
        if (dia >= 1 && dia <=30) {
            if (mes >= 1 && mes <= 12) {
                if (año >= 0) {
                    fecha=true;
                }
            }
        }
        if(fecha){
            System.out.println("La fecha introducida es correcta.");
        }else{
            System.out.println("La fecha introducida es incorrecta.");
        }
    }
}