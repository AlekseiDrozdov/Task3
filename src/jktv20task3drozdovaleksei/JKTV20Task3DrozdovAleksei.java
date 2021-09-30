/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktv20task3drozdovaleksei;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class JKTV20Task3DrozdovAleksei {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = in.nextLine();
        
        System.out.println("Введите фамилию: ");
        String lastname = in.nextLine();
        
        System.out.println("Введите год рождения: ");
        int year = in.nextInt();
        
         System.out.println("Введите месяц рождения: ");
        int month = in.nextInt();
        
         System.out.println("Введите день рождения: ");
        int day = in.nextInt();
        
        String month1="";
        switch(month){
            case 1: month1 = "Январь";
                     break;
            case 2: month1 = "Февраль";
                     break;  
            case 3: month1 = "Март";
                     break;  
            case 4: month1 = "Апрель";
                     break;  
            case 5: month1 = "Май";
                     break;  
            case 6: month1 = "Июнь";
                     break;  
            case 7: month1 = "Июль";
                     break; 
            case 8: month1 = "Август";
                     break;  
            case 9: month1 = "Сентбярь";
                     break;  
            case 10: month1 = "Октябрь";
                     break;  
            case 11: month1 = "Ноябрь";
                     break;  
            case 12: month1 = "Декабрь";
                     break;   
        }
          System.out.println(name+" "+lastname+" " + "родился"+" " + day+"." + month1+"." + year);
    }
    
}
