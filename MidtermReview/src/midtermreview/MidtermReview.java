
package midtermreview;


public class MidtermReview {


    public static void main(String[] args) {
        printDiamond(10);
    }
    
    public static void printDiamond(int maxWidth){
        if ( maxWidth % 2 == 0){
            maxWidth++;
        }
        
        int spaces = maxWidth / 2; // integer division here is good
        int stars = 1;

        while (stars <= maxWidth) {
            for (int space = 0; space < spaces; space++) {
                System.out.print(" ");
            }
            for (int star = 0; star < stars; star++) {
                System.out.print("*");
            }
            System.out.println("");
            stars += 2;
            spaces -= 1;
        }
        
        stars -= 4;
        spaces += 2;
        
        while (stars >= 1) {
            for (int space = 0; space < spaces; space++) {
                System.out.print(" ");
            }
            for (int star = 0; star < stars; star++) {
                System.out.print("*");
            }
            System.out.println("");
            stars -= 2;
            spaces += 1;
        }

    }
    
}
