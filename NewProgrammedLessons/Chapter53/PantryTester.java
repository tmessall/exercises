import java.util.Scanner;

public class PantryTester {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    Jam goose = new Jam( "Gooseberry", "7/4/86", 12 );
    Jam apple = new Jam( "Crab Apple", "9/30/99", 8 );
    Jam rhub  = new Jam( "Rhubarb", "10/31/99", 3 );

    System.out.println("Welcome to Mother Hubbard's Pantry!");

    Pantry hubbard = new Pantry( goose, apple, rhub );
   
    System.out.println("The jams are: \n" + hubbard);

    System.out.println("Enter your selection:");
    int jamChoice = scan.nextInt();

    while (jamChoice != -1) {
      System.out.println("Enter amount to spread:");
      int spreadAmount = scan.nextInt();
      hubbard.select(jamChoice);
      hubbard.spread(spreadAmount);
      System.out.println( hubbard );
      System.out.println("Enter your selection:");
      jamChoice = scan.nextInt();
    }

    System.out.println("Goodbye!");

    Pantry mine = new Pantry(goose);
    System.out.println("The jams are: \n" + mine);

    System.out.println("Enter your selection:");
    jamChoice = scan.nextInt();

    while (jamChoice != -1) {
      System.out.println("Enter amount to spread:");
      int spreadAmount = scan.nextInt();
      mine.select(jamChoice);
      mine.spread(spreadAmount);
      System.out.println( mine );
      System.out.println("Enter your selection:");
      jamChoice = scan.nextInt();
    }

    System.out.println("The hubbard jams are: \n" + hubbard);
    System.out.println("Goodbye!");

    Pantry scott = new Pantry(goose, apple);
    System.out.println("The jams are: \n" + scott.toString());

    System.out.println("Enter your selection:");
    jamChoice = scan.nextInt();

    while (jamChoice != -1) {
      System.out.println("Enter amount to spread:");
      int spreadAmount = scan.nextInt();
      scott.select(jamChoice);
      scott.spread(spreadAmount);
      System.out.println( scott );
      System.out.println("Enter your selection:");
      jamChoice = scan.nextInt();
    }

    System.out.println("The hubbard jams are: \n" + hubbard);
    System.out.println("Goodbye!");

    Pantry banana = new Pantry(goose, apple, rhub);
    Jam straw = new Jam("Strawberry", "7/10/18", 10);

    System.out.println(banana);
    banana.replace(straw, 2);
    System.out.println(banana);

    System.out.println("Enter your selection:");
    jamChoice = scan.nextInt();

    while (jamChoice != -1) {
      System.out.println("Enter amount to spread:");
      int spreadAmount = scan.nextInt();
      banana.select(jamChoice);
      banana.spread(spreadAmount);
      banana.mixedFruit();
      System.out.println( banana );
      System.out.println("Enter your selection:");
      jamChoice = scan.nextInt();
    }

  }
}