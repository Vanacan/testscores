/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testscores;
/**
 *
 * @author Taylor
 */
import java.io.*;
import java.util.Scanner;


public class Testscores {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException { 
        Scanner scan;
        scan = new Scanner(new File("C:\\java programs\\testscores.txt.txt"));
        
        String[] array1;
        array1 = new String[128];
            int count = 0;
       while(count < array1.length && scan.hasNext()){
           String part;
            part = scan.next();
           array1[count] = part;
           count++;
       }
       for (int i = 0; i < count; i++)
           System.out.println(array1[i]);
       }
        // TODO code application logic here
    }
