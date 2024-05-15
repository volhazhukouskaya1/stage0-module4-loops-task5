package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
for (int y=1; y<=height; y++) {
    if (y<=height/2) {
        for (int x=1; x<=height; x++) {
            if (x>=y && x<=(height-y+1)) {
                System.out.print("8");
            }
            else {
                System.out.print(" ");
            }
        }
    }
    else {
        for (int x=1; x<=height; x++) {
            if (x>=height-y+1 && x<=y) {
                System.out.print("8");
            }
            else {
                System.out.print(" ");
            }
        }

    }
   System.out.println();

}
    }
}
