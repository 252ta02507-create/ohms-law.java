import java.util.Scanner;

public class OhmsLaw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter voltage (V): ");
        double voltage = sc.nextDouble();

        System.out.print("Enter resistance (Ohms): ");
        double resistance = sc.nextDouble();

        if (resistance == 0) {
            System.out.println("Resistance cannot be zero.");
        } else {
            double current = voltage / resistance;
            System.out.println("Current = " + current + " A");
        }

        sc.close();
    }
}
