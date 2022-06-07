import java.util.Scanner;

public class SoundNs {
    public static void main(String[] args) {
        int speed=343;

        Scanner input=new Scanner(System.in);
        System.out.println("Enter the echo-time:");
        double time = input.nextDouble();
        double distance = speed * time/2;

        System.out.println("Distance:" + distance);

    }
}
