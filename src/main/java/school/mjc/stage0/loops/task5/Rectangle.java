package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height){
        for (int i=1; i<=height;i++ ) {
            if (i==1 || i==height) {
                for (int a=1; a<=length; a++) {
                    System.out.print("8");
                } }
            else {
                for (int a = 1; a <= length; a++) {
                    if (a == 1 || a == length) {
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
