import java.util.Scanner;

public class DiceJack {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int roll1 = rollDice();
        int roll2 = rollDice();
        int roll3 = rollDice();

        System.out.println("Enter the three numbers between 1 tp 6");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        if (num1 < 1 || num2 < 1 || num3 < 1){
            System.out.println("Number cannot be less than 1. Shutting game down");
            System.exit(0);
        }

        if (num1 > 6 || num2 > 6 || num3 > 6){
            System.out.println("Number cannot be greater than 6. Shutting game down");
            System.exit(0);
        }

        int sumOfNumber = num1+num2+num3;
        int sumDiceRolls = roll1+roll2+roll3;
        System.out.println("Dice sum = " + sumDiceRolls + ". number sum = " + sumOfNumber);

        checkWin(sumDiceRolls, sumOfNumber);

        // System.out.println(roll1);
        // System.out.println(roll2);
        // System.out.println(roll3);

        scan.close();
    }
    public static int rollDice(){
        //0 - .99999999999999
        double randomNumber = Math.random() * 6; //0 - 5.99999999999
        randomNumber += 1;  //1 - 6.9999999999
        return (int) randomNumber; //1 - 6

    }

    public static void checkWin(int sumDiceRolls, int sumOfNumber){
        if (sumOfNumber > sumDiceRolls && sumOfNumber - sumDiceRolls < 3){
            System.out.println("Congrats, you win!");
        }
        else{
            System.out.println("Sorry! you lose");
        }
    }
}
