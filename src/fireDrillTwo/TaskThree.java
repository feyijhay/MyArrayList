package fireDrillTwo;

import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int sum = 0;
        int average = 0;

        for(int check = 1; check<=10; check++){
            System.out.print("Enter number:");
            int numbers = input.nextInt();

            sum += numbers;
            average = sum / check;

        }

        System.out.printf("The total is :%d", sum);
        System.out.printf("The average is:%d", average);


    }
}
