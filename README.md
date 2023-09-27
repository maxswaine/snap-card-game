
# Snap!

A recreation of the classic card game Snap but on your computer! 

The user can choose to play against a computer or their friend, and take it in turns to put down cards until there are two cards with the same value in a row. 

Cards are displayed and are flexible depending on the suit of the card:
```
 -------------   
|10♦          |
|   -------   |
|  |♦     ♦|  |
|  |   ♦   |  |
|  |♦     ♦|  |
|  |       |  |
|  |♦     ♦|  |
|  |   ♦   |  |
|  |♦     ♦|  |
|   -------   |
|          ♦10|
 -------------
 -------------
|10♣          |
|   -------   |
|  |♣     ♣|  |
|  |   ♣   |  |
|  |♣     ♣|  |
|  |       |  |
|  |♣     ♣|  |
|  |   ♣   |  |
|  |♣     ♣|  |
|   -------   |
|          ♣10|
 -------------
```
## Features

- Play against computer
- Play against friend
- Abstract classes for users
- Snap game interface

### Computer vs users

The computer and the user take turns differently, although their functionality is the same. 

I have overridden the takeTurn method so that it prompts a human for the enter key but the computer does it automatically:

#### User
``` java
  @Override
    public boolean takeTurn(Player player1, Player player2) {
        System.out.println(getName() + ", Press Enter to take your turn");
        String input = scanner.nextLine();

        Optional<Card> playerCard = dealCard(getIndex());
        Optional<Card> opponentCard = player2.dealCard(player2.getIndex());
        /// Rest of code
```

#### Computer
``` java
 @Override
    public boolean takeTurn(Player player1, Player player2) {

        Optional<Card> playerCard = dealCard(getIndex());
        Optional<Card> opponentCard = player2.dealCard(player2.getIndex());
        /// Rest of code
```

## Optimizations

The use of Abstract classes and Interfaces has unified the code significantly. Because each player has to abide by the same ruleset, I have used an interface for the user's actions in the game.

In the future, I will be able to create other games and make each user abide to a different set of rules.

I have also used abstract classes for Player and CardGame so that I can instantiate new players that follow certain rules. For example, by creating an abstract class for CardGame that creates a deck and provides methods to order or shuffle the deck. This can be applied to a myriad of games that I can create in the future. 




## Bugs

### Timer
Creating a timer. This was one of the elements of the game I could not get to work. I tried using the Timer.util from Java and also tried using Threads to run multiple functions at the same time but it would not run.

### Score Count
Increasing the wins by loop. The game works on a loop but it is not 100% accurate on increasing this count. I have incremented it at the appropriate time on my code but whether it displays correctly is apparently a separate issue. 
