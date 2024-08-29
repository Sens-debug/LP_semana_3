package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


// Datos:

// Cantidad de compra: Se solicitará al usuario que ingrese la cantidad total de la compra (en pesos).
// Puntos por peso: La tienda otorga 1 punto por cada 10 pesos de compra.
// Niveles de Fidelización:
// Bronce: 0-100 puntos
// Plata: 101-500 puntos
// Oro: 501-1000 puntos
// Platino: Más de 1000 puntos
// Desafíos:


// 1. Calcular Puntos:

// Descripción: Crea un programa en Java que calcule los puntos acumulados por un cliente, basado en la cantidad de la compra y la regla de puntos por peso.
// Pistas:
// Utiliza la clase Scanner para obtener la cantidad de la compra del usuario.
// Utiliza la división entera (/) para calcular el número de puntos.
// Desafío:
// Declara una variable cantidadCompra de tipo double para almacenar la cantidad ingresada por el usuario.
// Calcula los puntos acumulados y guarda el resultado en una variable puntosAcumulados de tipo int.
// Imprime la cantidad de puntos acumulados en la consola.


double cantidadCompra,puntosAcumulados;

Scanner teclado = new Scanner(System.in);
System.out.println("Ingrese la cantidad de compra(Pesos) -->");
cantidadCompra=teclado.nextInt();
teclado.close();
puntosAcumulados = cantidadCompra/10;

// 2. Determinar Nivel de Fidelización:

// Descripción: Crea un programa que determine el nivel de fidelización del cliente en base a los puntos acumulados.
// Pistas:
// Utiliza operadores de comparación para evaluar si los puntos acumulados se encuentran dentro de los rangos de cada nivel de fidelización.
// Utiliza la estructura if-else if-else para determinar el nivel correspondiente.
// Desafío:
// Declara una variable nivelFidelizacion de tipo String para almacenar el nivel de fidelización.
// Compara puntosAcumulados con los rangos de cada nivel y asigna el nivel correspondiente a nivelFidelizacion.
// Imprime el nivel de fidelización en la consola.

// Niveles de Fidelización:
// Bronce: 0-100 puntos
// Plata: 101-500 puntos
// Oro: 501-1000 puntos
// Platino: Más de 1000 puntos

// 3. Ofertas Adicionales:

// Descripción: Añade ofertas adicionales al sistema, como un descuento adicional o un regalo por alcanzar ciertos niveles de fidelización.
// Pistas:
// Utiliza operadores lógicos (&& o ||) para combinar condiciones.
// Implementa una lógica que aplique el descuento o el regalo según el nivel de fidelización.
// Desafío:
// Añade una lógica que otorgue un descuento del 10% a los clientes con nivel Oro o Platino.
// Añade una lógica que otorgue un regalo especial (por ejemplo, un cupón para un producto) a los clientes con nivel Platino.
// Imprime las ofertas adicionales en la consola.
// Evaluación:

// Los participantes deben completar todos los desafíos correctamente, utilizando los conceptos de Java aprendidos.
// Se puede evaluar la precisión de los cálculos, la claridad del código y la capacidad de los participantes para implementar la lógica de las ofertas adicionales.

        String nivelFidelizacion = "";

        if (puntosAcumulados <=100 ) {nivelFidelizacion = "Bronce";}    
        if (puntosAcumulados >100 && puntosAcumulados <=500) {nivelFidelizacion = "Plata";}
        if (puntosAcumulados >500 && puntosAcumulados <=1000) {nivelFidelizacion = "Oro";
        double descuento= (cantidadCompra*10)/100;
        double descuento_aplicado = cantidadCompra-descuento;
        System.out.println("-Se le aplicará un descuento del 10% como premio por su nivel de fidelidiad, su cantidad a pagar despues del descuento es de ---> "+ descuento_aplicado);
    }
        if (puntosAcumulados >1000) {nivelFidelizacion = "Platino";
        double descuento= (cantidadCompra*10)/100;
        double descuento_aplicado = cantidadCompra-descuento;
        String cupon = "Derecho a un producto de limpieza gratis";
        System.out.println("-Se le aplicará un descuento del 10% como premio por su nivel de fideldiad, junto a un cupón de premio--> "+cupon+".");
        System.out.println("-Su cantidad a pagar despues del descuento es de ---> "+ descuento_aplicado);}

        System.out.println("-Su nivel de fidelizacion es --> "+nivelFidelizacion+", con "+puntosAcumulados+" puntos acumulados");

        

    }
}