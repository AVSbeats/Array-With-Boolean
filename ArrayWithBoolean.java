import javax.swing.plaf.synth.SynthSplitPaneUI;

public class ArrayWithBoolean {
    public static void main(String[] args) {

        boolean validItem = false;

        int customerOrderNumber = 50;

        int[] walmartOrderNumber = { 25, 50, 75, 100, 125, 150, 175, 200 };

        System.out.println(" "); // Space
        for (int i = 0; i < walmartOrderNumber.length; i++) {
            if (customerOrderNumber == walmartOrderNumber[i]) {
                validItem = true;
                System.out.println("The Order Number For Both are " + validItem);
            }

        }
        System.out.println(" "); // Space
    }
}
