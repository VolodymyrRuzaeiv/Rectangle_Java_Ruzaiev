/**
 * Rectangle
 * прямокутник
 */
public class Rectangle_Java_Ruzaiev {
    public static void main(String[] args) {

        int height = 0, width = 0;

        height = 5;
        width = 10;

        System.out.println("Rectangle");
        for (int i = 1; i <= height; i++) {
            for (int і = 1; і <= width; і++) {
                System.out.print("*" + " ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");

    }
}


