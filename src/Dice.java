import java.util.Random;
import java.util.Scanner;

public class Dice
{
    public static void main(String[] args)
    {

        Random gen = new Random();
        Scanner in = new Scanner(System.in);

        int die1 = 0;
        int die2 = -1;
        int die3 = 0;
        int dieSum;
        int dieRoll = 0;
        boolean done = false;
        String continueYN = "";

        do {
            dieRoll = 0;

            System.out.println("Roll#\tDie1\tDie2\tDie3\tdieSum");

            System.out.println("--------------------------------------");
            do {
                die1 = gen.nextInt(6) + 1;
                die2 = gen.nextInt(6) + 1;
                die3 = gen.nextInt(6) + 1;
                dieSum = die1 + die2 + die3;
                dieRoll++;
                System.out.printf("%6d\t%6d\t%6d\t%6d\t%6d\n", dieRoll, die1, die2, die3, dieSum);
            }while (!(die1 == die2 && die2 == die3));

            System.out.println("Do you want to roll again? [YN]: ");
            continueYN = in.nextLine();
            if (continueYN.equalsIgnoreCase("n"))
            {
                done = true;
            }

        }while(!done);

    }
}

