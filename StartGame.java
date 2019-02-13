import java.util.Scanner;
public class StartGame {
  
  public static void main(String[] args) {

    Player[]playerArray = new Player[3];
    
    
    Scanner reader = new Scanner(System.in);
    System.out.println("Enter Player 2 Name: ");
    String user = reader.nextLine();
    reader.close();
  
    Player player1 = new Player();
    player1.setName("Mr. Bartucz");
    playerArray[0] = player1;
    Player player2 = new Player();
    player2.setName(user);
    playerArray[1] = player2;
    
    Weapon weapon1 = new Weapon();
    weapon1.setWeapon("Sword");

    for (int i = 0; i < playerArray.length; i++){ 
      if (playerArray[i] != null){
        //System.out.println("Player" + i + " name is " + playerArray[i].getName());
        
        
      }
    }    
    
    System.out.println("Player1 name is: " + playerArray[0].getName());
    System.out.println("Player 2's name is: " + playerArray[1].getName());
    
    // this won't work until you create a getHealth method in your object. Uncomment it when you do.
    System.out.println(playerArray[0].getName() + "'s health is: " + player1.getHealth());
     System.out.println(playerArray[1].getName() +"'s health is: " + player2.getHealth());
     System.out.println(playerArray[0].getName() + " and " + playerArray[1].getName() + " are given a " + weapon1.getWeapon());
  }
}