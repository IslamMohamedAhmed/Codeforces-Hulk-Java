/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.hulk;

import java.util.*;

public class Hulk {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String love = "I Love ";
        String hate = "I hate ";
        String subject = "that ";
        int n;
        n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            if (i == n - 1) {
                subject = "it\n";
            }
            if (i % 2 == 0) {
                System.out.print(hate + subject);
            } else {
                System.out.print(love + subject);
            }
        }
    }
}
