// ResistorCalculator.java

import java.util.Scanner;

public class ResistorCalculator {

    public static double calculateNeededResistor(double inputVoltage, double operatingCurrent, double loadResistance) {
        return (inputVoltage - (operatingCurrent * loadResistance)) / operatingCurrent;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Resistor Calculator");

        System.out.print("Enter the input voltage (V): ");
        double inputVoltage = scanner.nextDouble();

        System.out.print("Enter the operating current (I): ");
        double operatingCurrent = scanner.nextDouble();

        System.out.print("Enter the load resistance (R_L): ");
        double loadResistance = scanner.nextDouble();

        double neededResistor = calculateNeededResistor(inputVoltage, operatingCurrent, loadResistance);

        System.out.printf("Needed Resistor: %.2f Ω%n", neededResistor);
        
        scanner.close();
    }
}
