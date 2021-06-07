import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Kieran Jimenez
 */
/*
 *           "Troubleshooting Car Issues" output
 * Is the car silent when you turn the key? y
 * Are the battery terminals corroded? n
 * The battery cables may be damaged.
 * Replace cables and try again.
 */
public class App
{
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args)
    {
        App myApp = new App();

        System.out.print("Is the car silent when you turn the key? ");
        if(myApp.response()) {
            System.out.print("Are the battery terminals corroded? ");
            if(myApp.response())
                System.out.print("Clean terminals and try starting again.");
            else
                System.out.print("Replace cables and try again.");
        }
        else {
            System.out.print("Does the car make a slicking noise?");
            if (myApp.response())
                System.out.print("Replace the battery.");
            else {
                System.out.print("Does the car crank up but fail to start?");
                if (myApp.response())
                    System.out.print("Check spark plug connections.");
                else
                {
                    System.out.print("Does the engine start and then die?");
                    if(myApp.response())
                    {
                        System.out.print("Does you car have fuel injection?");
                        if(myApp.response())
                            System.out.print("Get it in for service.");
                        else
                            System.out.print("Check to ensure the choke is opening and closing.");
                    }
                    else
                        System.out.print("This should not be possible.");
                }
            }
        }

    }
    private boolean response()
    {
        String answer = in.next();
        answer = answer.toLowerCase();

        return answer.equals("y") || answer.equals("yes");
    }
}