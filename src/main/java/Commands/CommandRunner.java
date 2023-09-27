package Commands;

import Snap.Snap;

import java.util.Scanner;

public class CommandRunner {
    private Scanner scanner = new Scanner(System.in);
    private String name;
    private final String[] introCommands = new String[]{"Read the rules", "Play against a computer", "Play against a friend", "Quit"};

    public void runCommands() {
        intro();
        chooseCommands();

    }

    protected void intro(){
        System.out.println("Hello! And welcome to Snap!");
        System.out.println("Please choose one of the options below");
    }
    public void chooseCommands(){
        boolean quit = false;
        do {
            for (int i = 0; i < introCommands.length; i++) {
                System.out.println((i + 1) + ": " + introCommands[i]);
            }
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    printRules();
                    break;
                case 2:
                    playAgainstComputer();
                    break;
                case 3:
                    playAgainstFriend();
                    break;
                case 4:
                    System.out.println("Thanks for playing!");
                    quit = true;
                    break;
            }
        } while (!quit);
    }
    public void printRules(){
        System.out.println("Snap rules:");
        System.out.println("The rules of the game are pretty easy");
        System.out.println("Take it in turns to place a card down by pressing enter. \nWhen there is a match, you will have to type in snap");
        System.out.println("If you type snap fast enough, you win!");
        System.out.println("Choose another option:");
        chooseCommands();
    }

    public static void playAgainstFriend(){
        Snap game = new Snap();
        game.runAgainstPlayer();
    }
    public static void playAgainstComputer(){
        Snap game = new Snap();
        game.runAgainstComputer();
    }
}
