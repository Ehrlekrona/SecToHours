package Exercises

import java.util.Scanner;

public class SecToHours {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter number of seconds");

        int Seconds = scanner.nextInt();

        int minutes = Seconds/60;

        int remainingSeconds = Seconds%60;

        int hours = minutes/60;

        int remainingMinutes = minutes%60;

        System.out.println(hours +":"+remainingMinutes +":"+remainingSeconds);

    }
}