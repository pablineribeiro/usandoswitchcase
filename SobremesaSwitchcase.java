/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exerciciosjava;

import java.util.Scanner;

/**
 *
 * @author senai
 */
public class SobremesaSwitchcase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Qual sobremesa deseja?1=Bombom 2=Pudim,3=Café");
        int resposta;
                Scanner input = new Scanner (System.in);
                resposta = input.nextInt();
                switch (resposta){
                    case 1:
                        System.out.println("Bombom, ok!");
                break;
                    case 2:
                        System.out.println("Pudim, ok");
                break;
                    case 3: 
                        System.out.println("Café, ok");
                default:
                System.out.println("Anything.");
                }
    }
    
}
