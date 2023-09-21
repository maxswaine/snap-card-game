package Commands;

import java.util.Scanner;

public abstract class CommandRunner {

    public static final String EXIT = "exit";
    public static final String QUIT = "quit";

    private Scanner scanner = new Scanner(System.in);

    private String name;

    protected String[] commands;
    protected CommandType nextCommands;

    public CommandRunner(String name, String[] commands) {
        this.name = name;
        this.commands = commands;
    }

    public void runCommands(){
        intro();
    }


    protected void intro(){
        System.out.println("Welcome to " + this.name);
    }
}
