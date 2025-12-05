package package_1;

interface Playable 
{
 void play();
}
class Game4
{
 void startGame() 
 {
     System.out.println("Game has started...");
 }
}
class Cricket extends Game4 implements Playable 
{
 public void play() 
 {
     System.out.println("Cricket game is being played.");
 }
}

class Football extends Game4 implements Playable 
{
 public void play() 
 {
     System.out.println("Football game is being played.");
 }
}

public class Game2 
{
 public static void main(String[] args) 
 {
     Cricket obj1 = new Cricket();
     Football obj2 = new Football();
     obj1.startGame();
     obj2.play();
     
     obj2.startGame();
     obj2.play();
 }
}
