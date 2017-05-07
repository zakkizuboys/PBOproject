/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KTP_EL;

import java.util.Scanner;

/**
 *
 * @author zakkizuboys
 */
public class DriverClass {
    public static void main(String[] args) {
        int c;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("1. kelurahan bisa");
        System.out.println("2. kelurahan siap");
        System.out.println("masukkan kelurahan : ");
        c = sc.nextInt();
        switch(c){
            case 1:
                System.out.println("pilih RT");
                System.out.println("1. RT 01");
                System.out.println("2. RT 02");
                System.out.println("3. RT 03");
                System.out.println("4. RT 04");
                System.out.println("5. RT 05");
                System.out.println("masukkan RT : ");
                break;
            case 2:
                System.out.println("pilih RT");
                System.out.println("1. RT 11");
                System.out.println("2. RT 12");
                System.out.println("3. RT 13");
                System.out.println("4. RT 14");
                System.out.println("5. RT 15");
                System.out.println("masukkan RT : ");
        }
    }
}
