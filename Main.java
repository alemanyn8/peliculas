package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int opcion = 0;
        Scanner sc = new Scanner(System.in);


        do {
            System.out.println("\n¿Qué ejercicio quieres ejecutar?(usa 0 para salir)");
            System.out.println("\t1. Ejercicio 1");
            System.out.println("\t2. Ejercicio 2");
            System.out.println("\t3. Ejercicio 3");
            System.out.println("\t4. Ejercicio 4");
            System.out.println("\t5. Ejercicio 5");
            System.out.println("\t6. Ejercicio 6");
            System.out.println("\t7. Ejercicio 7");
            System.out.println("\t8. Ejercicio 8");
            System.out.println("\t9. Ejercicio 9");
            System.out.println("\t10. Ejercicio 10");
            System.out.println("\t11. Ejercicio 11");
            System.out.println("\t12. Ejercicio 12");
            System.out.println("\t13. Ejercicio 13");
            System.out.println("\t0. Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    ejercicio1();
                    break;
                case 2:
                    ejercicio2();
                    break;
                case 3 :
                    ejercicio3();
                    break;
                case 4 :
                    ejercicio4();
                    break;
                case 5 :
                    ejercicio5();
                    break;
                case 6 :
                    ejercicio6();
                    break;
                case 7 :
                    ejercicio7();
                    break;
                case 8:
                    ejercicio8();
                    break;
                case 9:
                    ejercicio9();
                    break;
                case 10:
                    ejercicio10();
                    break;
                case 11:
                    ejercicio11();
                    break;
                case 12:
                    ejercicio12();
                    break;
                case 13:
                    ejercicio13();
                    break;
                case 0:
                    System.out.println("¡Hasta otra!");
                    break;
            }

        } while (opcion != 0);
    }

    public static void ejercicio1() {
        System.out.println("Probando ejercicio 1");
        int edad = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("que edad tienes");
        edad = sc.nextInt();

        if (edad >= 18) {
            System.out.println("eres mayor de edad");
        }
    }

        public static void ejercicio2 () {
            System.out.println("Probando ejercicio 2");
            int edad = 0 ;

            Scanner sc = new Scanner(System.in);
            System.out.println("que edad tienes");
            edad=sc.nextInt();

            if(edad >= 18 ){
                System.out.println("eres mayor de edad");
            }
            else {
                System.out.println("eres menor de edad");
            }
        }

        public static void ejercicio3() {
        System.out.println("Probando ejercicio 3");
        float num1 = 0,num2 = 0,sum = 0,res = 0, mult = 0, div = 0 ;
            Scanner sc = new Scanner(System.in);


            System.out.println("ponga el primer numero");
            num1 = sc.nextFloat();

            System.out.println("ponga el segundo numero");
            num2 = sc.nextFloat();

            sum = num1 + num2;
            res = num1 - num2;
            mult = num1 * num2;
            if (num1 == 0){
                System.out.println("un numero es 0 asi que no se puede hacer las divisiones el resultado de la suma resta y multiplicacion son los siguientes. suma " + sum + "resta" + res + " multiplicacion " + mult );
            }
            else if (num2 == 0){
                System.out.println("un numero es 0 asi que no se puede hacer las divisiones el resultado de la suma resta y multiplicacion son los siguientes. suma " + sum + "resta" + res + " multiplicacion " + mult );

            }
            else{
                div = num1/num2;
                System.out.println("los resultados son suma " + sum + " resta " + res + " multiplicacion " + mult + "division" + div);
            }
        }
        public static void ejercicio4() {
            System.out.println("Probando ejercicio 4");
         float num1 = 0 ,num2 = 0;
            Scanner sc = new Scanner(System.in);


            System.out.println("ponga el primer numero");
            num1 = sc.nextFloat();

            System.out.println("ponga el segundo numero");
            num2 = sc.nextFloat();

            if (num1 > num2){
                System.out.println(num1 + " es el mayor numero");

            }
            else{
                System.out.println(num2 + " es el mayor numero");
            }
        }
        public static void ejercicio5() {
            System.out.println("Probando ejercicio 5");
            float num1 = 0 ,num2 = 0;
            Scanner sc = new Scanner(System.in);


            System.out.println("ponga el primer numero");
            num1 = sc.nextFloat();

            System.out.println("ponga el segundo numero");
            num2 = sc.nextFloat();

            if (num1 > num2){
                System.out.println(num1 + ">" + num2);

            }
            else{
                System.out.println(num2 + ">" + num1);
            }
        }

        public static void ejercicio6() {
            System.out.println("Probando ejercicio 6");

            float num1 = 0 ,num2 = 0;
            Scanner sc = new Scanner(System.in);


            System.out.println("ponga el primer numero");
            num1 = sc.nextFloat();

            System.out.println("ponga el segundo numero");
            num2 = sc.nextFloat();

            if (num1 > num2){
                System.out.println(num1 + ">" + num2);

            }
            else if (num1 == num2){
                System.out.println(num2 + "=" + num1);
            }
            else{
                System.out.println(num2 + ">" + num1);
            }

        }
        public static void ejercicio7(){
            System.out.println("Probando ejercicio 7");

            Scanner sc = new Scanner(System.in);
            int num1, num2, num3;
            System.out.print("Introduzca primer número: ");
            num1 = sc.nextInt();
            System.out.print("Introduzca segundo número: ");
            num2 = sc.nextInt();
            System.out.print("Introduzca tercer número: ");
            num3 = sc.nextInt();
            if (num1 > num2) {
                if (num1 > num3) {
                    System.out.println("El mayor es: " + num1);
                }
                else {
                    System.out.println("el mayor es: " + num3);
                }
            } else if (num2 > num3) {
                System.out.println("el mayor es: " + num2);
            } else {
                System.out.println("el mayor es: " + num3);
            }
        }
        public static void ejercicio8(){
            System.out.println("Probando ejercicio 8");

            Scanner sc = new Scanner(System.in);
            float precio=0, revaja = 0;
            System.out.println("indica el precio del objeto");
            precio= sc.nextFloat();
            if(precio > 100){
                revaja = precio *10 /100;
                precio = precio - revaja;
                System.out.println("tendras que pagar " + precio);
            }
            else {
                System.out.println("el precio es el mismo es decir " + precio);
            }

        }
        public static void ejercicio9(){
            System.out.println("Probando ejercicio 9");

            Scanner sc = new Scanner(System.in);
            float precio=0, revaja = 0;
            System.out.println("indica el precio del objeto");
            precio= sc.nextFloat();
            if(precio > 100){
                revaja = precio *10 /100;
                precio = precio - revaja;
                System.out.println("tendras que pagar " + precio);
            }
            else if (precio < 30){
                precio = precio + 2;
                System.out.println("tendras una penalizacion de 2 euros por ser un precio muy bajo lo cual deja el precio en" + precio);
            }
            else {
                System.out.println("el precio es el mismo es decir " + precio);
            }
        }
        public static void ejercicio10(){
            System.out.println("Probando ejercicio 10");

            float n = 0;
            Scanner sc = new Scanner(System.in);

            System.out.println ("por favor ponga una nota");
            n = sc.nextFloat();

            if(n >= 9){
                System.out.println ("sobresaliente");
            }
            else if( n >= 6){
                System.out.println ("notable");

            }
            else if( n >= 7){
                System.out.println ("notable");

            }
            else if( n >= 5){
                System.out.println ("bien");

            }
            else if( n >= 3){
                System.out.println ("insuficiente");

            }
            else {
                System.out.println ("muy deficientet");

            }


        }


        public static void ejercicio11(){
            System.out.println("Probando ejercicio 11");
            Scanner sc = new Scanner(System.in);
            String nombre;
            int horas;
            float salario ,impuestos ,neto ,bruto;

            System.out.println("indica el nombre");
            nombre = sc.nextLine();
            System.out.println("cuantas horas trabaja");
            horas = sc.nextInt();
            System.out.println("cuanto gana por hora");
            salario= sc.nextFloat();

            if (horas > 35) {
                horas = horas - 35;
                bruto = (float) (salario * 35 + (horas * salario * 1.5));
            }
            else{
                bruto = horas * salario;
            }
            if(bruto > 500){
                if (bruto > 900){
                    impuestos = (float) (100 +((bruto - 900)* 0.45 ));
                    neto = bruto -impuestos;
                }
                else{

                }
                impuestos = (float) ((bruto - 500) * 0.25);
                neto = bruto - impuestos;
            }
            else{
            neto = bruto;
            }
            System.out.println("el salario de " + nombre + " es de " + bruto + "€ en bruto que pasan a ser " + neto + "€ tras quitarle impuestos");
    }
        public static void ejercicio12(){
            System.out.println("Probando ejercicio 12");
            System.out.println("por favor introduzca las notas una a una");
            Scanner sc = new Scanner(System.in);
            float numero = 1  , notatotal= 0;
            int aprobados = 0, suspendidos = 0 , total = 0;


            while (numero > 0 ) {
                numero = sc.nextFloat();
                if (numero > 0 && numero < 10){
                    total++;
                    notatotal = notatotal + numero;
                    if (numero >= 5){
                        aprobados++;
                        numero = sc.nextFloat();
                    }
                    else{
                        suspendidos++;
                        numero = sc.nextFloat();
                    }
                }
                else{
                    if(numero > 10){
                        System.out.println("valor no valido ponga otro valor");
                        numero = sc.nextFloat();
                    }
                    else{
                        System.out.println("han aprobado " + aprobados + " personas han suspendido " + suspendidos + " personas la nota media es de " + (notatotal /total));
                    }
                }

            }
        }
        public static void ejercicio13(){
            System.out.println("Probando ejercicio 13");
            int opcion;
            float num1 , num2 ;
            Scanner sc = new Scanner(System.in);

            System.out.println("elige una opcion");
            System.out.println("1 operaciones sencillas");
            System.out.println("2 operaciones complejas");
            System.out.println("3 salir");
            opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("1 suma");
                    System.out.println("2 resta");
                    System.out.println("3 division");
                    System.out.println("4 multiplicacion");
                    opcion = sc.nextInt();
                    switch (opcion){
                        case 1:
                            System.out.println("por favor ponga un numero");
                            num1 = sc.nextFloat();
                            System.out.println("por favor ponga el segundo numero");
                            num2 = sc.nextFloat();
                            System.out.println(" el resultado de la operacion elegida es " + (num1 + num2));
                            break;
                        case 2:
                            System.out.println("por favor ponga un numero");
                            num1 = sc.nextFloat();
                            System.out.println("por favor ponga el segundo numero");
                            num2 = sc.nextFloat();
                            System.out.println(" el resultado de la operacion elegida es " + (num1 - num2));

                            break;
                        case 3:
                            System.out.println("por favor ponga un numero");
                            num1 = sc.nextFloat();
                            System.out.println("por favor ponga el segundo numero");
                            num2 = sc.nextFloat();
                            System.out.println(" el resultado de la operacion elegida es " + (num1 / num2));

                            break;
                        case 4:
                            System.out.println("por favor ponga un numero");
                            num1 = sc.nextFloat();
                            System.out.println("por favor ponga el segundo numero");
                            num2 = sc.nextFloat();
                            System.out.println(" el resultado de la operacion elegida es " + (num1 * num2));
                            break;
                        default:
                            System.out.println("valor no valido");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("1 potencia");
                    System.out.println("2 raiz cuadrada");
                    opcion = sc.nextInt();
                    switch (opcion){
                        case 1:
                            System.out.println("por favor ponga un numero");
                            num1 = sc.nextFloat();
                            System.out.println("por favor ponga la cantidad a la que lo vas a elevar");
                            num2 = sc.nextFloat();
                            System.out.println(" el resultado de la operacion elegida es " + Math.pow(num1, num2));
                            break;
                        case 2:
                            System.out.println("por favor ponga un numero");
                            num1 = sc.nextFloat();
                            System.out.println(" el resultado de la operacion elegida es " + Math.sqrt(num1));
                            break;
                    }
                    break;
                case 3:
                    System.out.println("apagando calculadora...");
                    break;
                default:
                    System.out.println("opcion no valida apagando calculadora ...");
                    break;
            }



    }

}

