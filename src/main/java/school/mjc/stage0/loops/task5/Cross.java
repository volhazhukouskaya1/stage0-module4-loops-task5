package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
     for (int i=1; i<=sideLength;i++) {
         if (i == (Math.round((double)sideLength/2))) {
             for (int x = 1; x <= sideLength; x++) {
                 System.out.print("8");
             }
         }
             else{
                 for (int x = 1; x<=sideLength; x++) {
                 if (x == (Math.round((double)sideLength/2))) {
                              System.out.print("8"); }
                 else { System.out.print(" ");}
       }
     }
             System.out.println();
     }
    }
}
