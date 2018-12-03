import java.util.Scanner;

class PhoneEntry
{
  private String lastName;
  private String firstName;
  private String phone;

  public PhoneEntry( String m, String n, String p )
  {
    firstName = m; lastName = n; phone = p;
  }
  
  public String getFirstName()  {return firstName;}
  public String getLastName() {return lastName;}
  public String getPhone() {return phone;}
}

class PhoneBook
{ 
  private PhoneEntry[] phoneBook; 

  public PhoneBook()    // constructor
  {
    phoneBook = new PhoneEntry[ 7 ] ;

    phoneBook[0] = new PhoneEntry( "James", "Barclay", "(418) 665-1223" );
    phoneBook[1] = new PhoneEntry( "Grace", "Dunbar", "(860) 399-3044" );
    phoneBook[2] = new PhoneEntry( "Paul", "Kratides", "(815) 439-9271" );
    phoneBook[3] = new PhoneEntry( "Violet", "Smith", "(312) 223-1937" );
    phoneBook[4] = new PhoneEntry( "John", "Wood", "(913) 883-2874" );
    phoneBook[5] = new PhoneEntry( "John", "Smith", "(812) 339-4916");
    phoneBook[6] = new PhoneEntry( "Willoughby", "Smith", "(312) 992-8761");

  }

  public PhoneEntry search(String targetFirstName, String targetLastName)  
  {
    for ( int j=0; j < phoneBook.length; j++ )
    {
      if ( phoneBook[ j] != null && phoneBook[j].getFirstName().toUpperCase().equals(targetFirstName) && phoneBook[j].getLastName().toUpperCase().equals(targetLastName)) {
        return phoneBook[j];
      }
    }

    return null;
  }

  public PhoneEntry[] searchAllLasts(String targetName) {
    PhoneEntry[] allNames = new PhoneEntry[phoneBook.length];
    for (int j = 0; j < phoneBook.length; j++) {
      if ( phoneBook[j] != null && phoneBook[j].getLastName().toUpperCase().equals(targetName)) {
        allNames[j] = phoneBook[j];
      }
    }
    return allNames;
  }
}


public class PhoneBookTester
{
  public static void main ( String[] args )
  {
    PhoneBook pb = new PhoneBook(); 
    Scanner scan = new Scanner(System.in); 
  
    System.out.println("Last Name?");
    String searchLastName = scan.nextLine();

    while (! searchLastName.equals("quit")){
      System.out.println("First Name?");
      String searchFirstName = scan.nextLine();
      if (searchFirstName.isEmpty()) {
        PhoneEntry[] entries = pb.searchAllLasts(searchLastName.toUpperCase());
        for (int i = 0; i < entries.length; i++) {
          if (entries[i] != null) {
            System.out.println(entries[i].getFirstName() + " " + entries[i].getLastName() + ": " + entries[i].getPhone());
          }
        }
      } else {
        PhoneEntry entry = pb.search(searchFirstName.toUpperCase(), searchLastName.toUpperCase()); 
        if ( entry != null ) {
         System.out.println("The number is: " + entry.getPhone());
        } else {
          System.out.println("Name not found" );
        }
      }  
      System.out.println("");
      System.out.println("Last Name?");
      searchLastName = scan.nextLine();
    }

    System.out.println("good-by");

  }
}
