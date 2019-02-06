import java.util.Scanner;
public class StartGame {
  
  public static void main(String[] args) {

    Scanner reader = new Scanner(System.in);
    System.out.println("Enter Player 2 Name: ");
    String user = reader.nextLine();
    reader.close();
  
    Player player1 = new Player();
    player1.setName("Mr. Bartucz");
    Player player2 = new Player();

    player2.setName(user);
    
    Weapon weapon1 = new Weapon();
    weapon1.setWeapon("Sword");

    
    System.out.println("Player1 name is: " + player1.getName());
    System.out.println("Player 2's name is: " + player2.getName());
    
    // this won't work until you create a getHealth method in your object. Uncomment it when you do.
     System.out.println(player1.getName() + "'s health is: " + player1.getHealth());
     System.out.println(player2.getName() +"'s health is: " + player2.getHealth());
     System.out.println(player1.getName() + " and " + player2.getName() + " are given a " + weapon1.getWeapon());
     
  }
}