package school.mjc.stage0.loops.task5;

import javax.swing.*;

public class Square {
    public void printSquareFrom8s(int sideLength){
   for (int i=1; i<=sideLength;i++ ) {
      if (i==1 || i==sideLength) {
        for (int a=1; a<=sideLength; a++) {
        System.out.print("8");
       } }
       else {
          for (int a = 1; a <= sideLength; a++) {
              if (a == 1 || a == sideLength) {
                  System.out.print("8");
              } else {
                  System.out.print(" ");
              }
          }
      }
       System.out.println();
   }
    }
}
