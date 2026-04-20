/* * Name: Tarik Kameric
 * Assignment: Program 3
 */

public class Driver {
    public static void main(String[] args) {
        System.out.println("--- VALID TESTS ---");
        CPU highEnd = new CPU("Ryzen 9", 16);
        ComputerSystem zenith = new ComputerSystem("Zenith V1", highEnd);
        System.out.println(zenith);

        System.out.println("\n--- INVALID TESTS ---");
        CPU broken = new CPU(null, -8); // Testing invariant
        System.out.println("Fixed Core Count: " + broken.getCores());

        System.out.println("\n--- BOUNDARY TESTS ---");
        CPU minCpu = new CPU("Basic", 1); // Lower boundary
        System.out.println("Min cores check: " + minCpu);
        
        CPU maxCpu = new CPU("Supercomputer", 128); // Upper boundary
        System.out.println("Max cores check: " + maxCpu);
    }
}