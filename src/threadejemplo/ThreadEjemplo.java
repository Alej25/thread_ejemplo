/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package threadejemplo;

/**
 *
 * @author jorge
 */
 public class ThreadEjemplo extends Thread {
     
  public ThreadEjemplo(String str) {
   super(str);
}
  
public void run() {
    
  for(int i = 0; i < 10 ; i++)
    System.out.println(i + " " + getName());
    System.out.println("Termina thread " + getName());
    
}
public static void main(String [] args) {
    new ThreadEjemplo("Pepe").start();
    new ThreadEjemplo("Juan").start();
        System.out.println("Termina thread main");
    }
}