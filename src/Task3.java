import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float inputF = scanner.nextFloat();
        System.out.printf("user has inputted: %.2f", inputF);

        byte inputB = scanner.nextByte();
        System.out.println("user input: " + inputB);

        char inputC = scanner.next().charAt(0);
        System.out.println("user input: "+ inputC);
    }
}
