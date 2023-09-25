package Snap;

public class Card{
    protected String suit;
    protected String symbol;
    protected int value;
    String WHITE_BG = "";
    String DEFAULT = "\u001B[0m";

    public Card(String suit, String symbol, int value) {
        this.suit = suit;
        this.symbol = symbol;
        this.value = value;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        switch (this.symbol) {
            case "2":
                return  " -------------\n" +
                        "|2" + this.suit + "           "+ DEFAULT+"|\n" +
                        "|   -------   |\n" +
                        "|  |       |  |\n" +
                        "|  |   " + this.suit + "   |  |\n" +
                        "|  |       |  |\n" +
                        "|  |       |  |\n" +
                        "|  |       |  |\n" +
                        "|  |       |  |\n" +
                        "|  |   " + this.suit + "   |  |\n" +
                        "|   -------   |\n" +
                        "|           " + this.suit + "2|\n" +
                        " -------------";
            case "3":
                return " -------------\n" +
                        "|3" + this.suit + "           |\n" +
                        "|   -------   |\n" +
                        "|  |   " + this.suit + "   |  |\n" +
                        "|  |       |  |\n" +
                        "|  |       |  |\n" +
                        "|  |   " + this.suit + "   |  |\n" +
                        "|  |       |  |\n" +
                        "|  |       |  |\n" +
                        "|  |   " + this.suit + "   |  |\n" +
                        "|   -------   |\n" +
                        "|           " + this.suit + "3|\n" +
                        " -------------";
            case "4":
                return " -------------\n" +
                        "|4" + this.suit + "           |\n" +
                        "|   -------   |\n" +
                        "|  |" + this.suit + "     " + this.suit + "|  |\n" +
                        "|  |       |  |\n" +
                        "|  |       |  |\n" +
                        "|  |       |  |\n" +
                        "|  |       |  |\n" +
                        "|  |       |  |\n" +
                        "|  |" + this.suit + "     " + this.suit + "|  |\n" +
                        "|   -------   |\n" +
                        "|           " + this.suit + "4|\n" +
                        " -------------";
            case "5":
                return " -------------\n" +
                        "|5" + this.suit + "           |\n" +
                        "|   -------   |\n" +
                        "|  |" + this.suit + "     " + this.suit + "|  |\n" +
                        "|  |       |  |\n" +
                        "|  |       |  |\n" +
                        "|  |   " + this.suit + "   |  |\n" +
                        "|  |       |  |\n" +
                        "|  |       |  |\n" +
                        "|  |" + this.suit + "     " + this.suit + "|  |\n" +
                        "|   -------   |\n" +
                        "|           " + this.suit + "5|\n" +
                        " -------------";
            case "6":
                return " -------------\n" +
                        "|6" + this.suit + "           |\n" +
                        "|   -------   |\n" +
                        "|  |" + this.suit + "     " + this.suit + "|  |\n" +
                        "|  |       |  |\n" +
                        "|  |       |  |\n" +
                        "|  |" + this.suit + "     " + this.suit + "|  |\n" +
                        "|  |       |  |\n" +
                        "|  |       |  |\n" +
                        "|  |" + this.suit + "     " + this.suit + "|  |\n" +
                        "|   -------   |\n" +
                        "|           " + this.suit + "6|\n" +
                        " -------------";
            case "7":
                return " -------------\n" +
                        "|7" + this.suit + "           |\n" +
                        "|   -------   |\n" +
                        "|  |" + this.suit + "     " + this.suit + "|  |\n" +
                        "|  |   " + this.suit + "   |  |\n" +
                        "|  |       |  |\n" +
                        "|  |" + this.suit + "     " + this.suit + "|  |\n" +
                        "|  |       |  |\n" +
                        "|  |       |  |\n" +
                        "|  |" + this.suit + "     " + this.suit + "|  |\n" +
                        "|   -------   |\n" +
                        "|           " + this.suit + "7|\n" +
                        " -------------";
            case "8":
                return " -------------\n" +
                        "|8" + this.suit + "           |\n" +
                        "|   -------   |\n" +
                        "|  |" + this.suit + "     " + this.suit + "|  |\n" +
                        "|  |   " + this.suit + "   |  |\n" +
                        "|  |       |  |\n" +
                        "|  |" + this.suit + "     " + this.suit + "|  |\n" +
                        "|  |       |  |\n" +
                        "|  |   " + this.suit + "   |  |\n" +
                        "|  |" + this.suit + "     " + this.suit + "|  |\n" +
                        "|   -------   |\n" +
                        "|           " + this.suit + "8|\n" +
                        " -------------";
            case "9":
                return " -------------\n" +
                        "|9" + this.suit + "           |\n" +
                        "|   -------   |\n" +
                        "|  |" + this.suit + "     " + this.suit + "|  |\n" +
                        "|  |       |  |\n" +
                        "|  |" + this.suit + "     " + this.suit + "|  |\n" +
                        "|  |   " + this.suit + "   |  |\n" +
                        "|  |" + this.suit + "     " + this.suit + "|  |\n" +
                        "|  |       |  |\n" +
                        "|  |" + this.suit + "     " + this.suit + "|  |\n" +
                        "|   -------   |\n" +
                        "|           " + this.suit + "9|\n" +
                        " -------------";
            case "10":
                return " -------------\n" +
                        "|10" + this.suit + "           |\n" +
                        "|   -------   |\n" +
                        "|  |" + this.suit + "     " + this.suit + "|  |\n" +
                        "|  |   " + this.suit + "   |  |\n" +
                        "|  |" + this.suit + "     " + this.suit + "|  |\n" +
                        "|  |       |  |\n" +
                        "|  |" + this.suit + "     " + this.suit + "|  |\n" +
                        "|  |   " + this.suit + "   |  |\n" +
                        "|  |" + this.suit + "     " + this.suit + "|  |\n" +
                        "|   -------   |\n" +
                        "|           " + this.suit + "10|\n" +
                        " -------------";
            case "J":
            case "Q":
            case "K":
                return " -------------\n" +
                        "|" + this.symbol + this.suit + "           |\n" +
                        "|   -------   |\n" +
                        "|  |" + this.suit + "      |  |\n" +
                        "|  |       |  |\n" +
                        "|  |       |  |\n" +
                        "|  |   " + this.symbol + "   |  |\n" +
                        "|  |       |  |\n" +
                        "|  |       |  |\n" +
                        "|  |      " + this.suit + "|  |\n" +
                        "|   -------   |\n" +
                        "|           " + this.suit + this.symbol + "|\n"+
                        " -------------";
            case "A":
                return " -------------\n" +
                        "|A" + this.suit + "           "+ DEFAULT+"|\n" +
                        "|   -------   |\n" +
                        "|  |       |  |\n" +
                        "|  |       |  |\n" +
                        "|  |       |  |\n" +
                        "|  |   " + this.suit + "   |  |\n" +
                        "|  |       |  |\n" +
                        "|  |       |  |\n" +
                        "|  |       |  |\n" +
                        "|   -------   |\n" +
                        "|           " + this.suit + "A|\n" +
                        " -------------";
            default:
                return " -------------\n" +
                        "|* * * * * * *|\n" +
                        "| * * * * * * |\n" +
                        "|* * * * * * *|\n" +
                        "| * * * * * * |\n" +
                        "|* * * * * * *|\n" +
                        "| * * * * * * |\n" +
                        "|* * * * * * *|\n" +
                        "| * * * * * * |\n" +
                        "|* * * * * * *|\n" +
                        "| * * * * * * |\n" +
                        "|* * * * * * *|\n" +
                        " -------------";
        }
    }

    }
