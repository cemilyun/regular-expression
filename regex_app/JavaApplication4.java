/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.Scanner;

/**
 *
 * @author CEM
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    private static int linearSearch(char[] liste, char arananSayi) { //linearSearch metotumuz

        for (int i = 0; i < liste.length; i++) { //döngümüz dizimizin uzunluğu kadar dönüyor
            if (liste[i] == arananSayi) { //sırası ile tüm elemanlara bakıyourz
                return i; //eğer aradığımız elemanı bulduysak index'ini geri gönderiyoruz
            }
        }
        return -1; //Herhangi  bir değer bulunamadıysa -1 dönderiyoruz
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Alfabeyi giriniz: ");
        String alfabe = sc.next();
        String[] alfabeliste = alfabe.split(",");
        String s = "";
        for (String n : alfabeliste) {
            s += n;
        }
        char[] alfabechar = s.toCharArray();
        System.out.print("Düzenli ifadeyi giriniz: ");
        String formattedStr02 = sc.next();
        String kontrol = formattedStr02;
        for (int i = 0; i < kontrol.length(); i++) {
            kontrol = kontrol.replace("+", "");
            kontrol = kontrol.replace("(", "");
            kontrol = kontrol.replace(")", "");
            kontrol = kontrol.replace("*", "");
            char harf = kontrol.charAt(i);
            char[] gecici = new char[kontrol.length()];
            gecici[i] = harf;
            int sayiIndex = linearSearch(alfabechar, gecici[i]);
            if (sayiIndex == -1) {
                System.out.println("Bu düzenli ifadeden kelime üretilemez.");
                System.exit(0);
            } else {
                System.out.print("L dilinin kaç kelimesini görmek istiyorsunuz? : ");
                int sayi = sc.nextInt();
                for (int j = 0; j < sayi; j++) {
                    if (formattedStr02.equals("("+alfabeliste[i] + "+" + alfabeliste[i + 1]+")")) {
                        System.out.print(alfabeliste[j] + ",");
                    }

                }
                break;
            }
        }
        System.out.println("");
        while (true) {
            int val = 1;
            System.out.println("Çıkmak istiyorsanız 0 yazin, kelime kontrolü icin 1 yazin");
            val = sc.nextInt();
            if (val >= 1) {
                System.out.println("kelime giriniz");
                String ex = sc.next();
                System.out.println("Düzenli ifadeyi giriniz");
                String format = sc.next();
                format = format.replace("+", "");
                format = format.replace("(", "[");
                format = format.replace(")", "]");
                boolean sonuc = ex.matches(format);
                if (sonuc == false) {
                    System.out.println("Bu kelime bu dile ait değildir.");
                } else {
                    System.out.println("Bu kelime bu dile aittir.");
                }
                System.out.println("-----------");
            } else {
                break;
            }
        }
    }

}
