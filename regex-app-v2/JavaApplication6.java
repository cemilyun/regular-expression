/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author CEM
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("kelime giriniz");
            String ex = sc.next();
            System.out.println("Düzenli ifadeyi giriniz");
            String formattedStr02 = sc.next();
            formattedStr02 = formattedStr02.replace("+","");
            formattedStr02 = formattedStr02.replace("(","[");
            formattedStr02 = formattedStr02.replace(")","]");
            System.out.println(formattedStr02);
            boolean sonuc = ex.matches(formattedStr02);
            if (sonuc==false) {
                System.out.println("Bu kelime bu dile ait değildir.");
            }else{
                System.out.println("Bu kelime bu dile aittir.");
            }
            System.out.println("-----------");
        }
    }
    
}
