/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividad;

import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class Recursividad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a;
        Scanner entrada = new Scanner (System.in); 
        a = Integer.parseInt(entrada.nextLine());
        System.out.println(sumar_dig(a));
    }
    public static int sumar_dig (int n){
	if (n == 0)      //caso base
	    return n;
	else
	    return sumar_dig (n / 10) + (n % 10);
    }
}
