/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.unidad_01_02;

/**
 *
 * @author NOTEBOOK
 */
public class Unidad_01_02 {

  public static void main(String[] args) {
      System.out.println("Hello world");
        
        var autoAngel = new Auto();
        autoAngel.color="amarillo";
        autoAngel.marca="chevrolet";
        autoAngel.year= 2017;
        autoAngel.placa="ABB 0102";
        autoAngel.precio= 5000;
        
        System.out.println(autoAngel.color+" | "+
                           autoAngel.marca+" | "+
                           autoAngel.year+" | "+
                           autoAngel.precio+" | "+
                           autoAngel.precio+" | ");
        
        ////System.out.println("Es taxi;"+autoJuan.esTaxi());
        var esTaxi=false;
        esTaxi= autoAngel.esTaxi();
        if(esTaxi==true){
            System.out.println("El auto de placa "+autoAngel.placa+ " es un taxi");
        }else{
            System.out.println("El auto de placa "+autoAngel.placa+ " NO es un taxi");
        }
       
        System.out.println(" El auto de precio "+ autoAngel.precio+ " Debe pagar de tasa solidaria "+ autoAngel.calcularTasaSolidaria());
        
        autoAngel.color="Blanco";
        autoAngel.marca="Toyota";
        autoAngel.year= 2019;
        autoAngel.placa="ABD 567";
        autoAngel.precio= 9000;
        
        System.out.println(autoAngel.color+" | "+
                           autoAngel.marca+" | "+
                           autoAngel.year+" | "+
                           autoAngel.precio+" | "+
                           autoAngel.placa+" | ");
        
        
       
        
        esTaxi= autoAngel.esTaxi();
        if(esTaxi==true){
            System.out.println("El auto de placa"+autoAngel.placa+ " es un taxi");
        }else{
             System.out.println("El auto de placa"+autoAngel.placa+ " NO es un taxi");       
        }
        
        
        System.out.println("El auto de precio "+ autoAngel.precio+ " Debe pagar de tasa solidaria "+ autoAngel.calcularTasaSolidaria());
        
           var costoMatricula=10000d;
        costoMatricula=autoAngel.calcularMatricula(2010, 10000);
        System.out.println("Debe pagar "+costoMatricula+" USD por concepto de matrícula");
    }
}