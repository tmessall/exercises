import java.util.Scanner;

class PhoneEntry
{
  private String firstName;
  private String lastName;
  private String phone;

  public PhoneEntry( String m, String n, String p )
  {
    firstName = m; 
    lastName = n;
    phone = p;
  }
  
  public String getName()  {return name;}
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
    phoneBook[5] = new PhoneEntry( "Willet", "Smith", "(312) 223-1937")
    phoneBook[6] = new PhoneEntry( "Lily", "Smith", "(312) 992-8761")

  }

  public PhoneEntry search( String targetName )  
  {
    for ( int j=0; j < phoneBook.length; j++ )
    {
      if ( phoneBook[ j] != null && phoneBook[ j ].getName().toUpperCase().equals( targetName ) )
        return phoneBook[ j ];
    }

    return null;
  }

  public int lastSearch( String targetName ) {
  	for ( int j=0; j < phoneBook.length; j++ )
    {
      if ( phoneBook[ j] != null && phoneBook[ j ].getName().toUpperCase().equals( targetName ) )
        return j;
    }

    return null;
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
    System.out.println("First Name?");
    String searchFirstName = scan.nextLine();

    while (! searchLastName.equals("quit")){
		if (searchFirstName.equals(null)) {
			PhoneEntry entry = pb.lastSearch(searchLastName);
		}
   		if ( entry != null )
   			System.out.println("The number is: " + entry.getPhone());
  		else
   			System.out.println("Name not found" );
   		System.out.println("");
   		System.out.println("Name?");
   		searchName = scan.nextLine();
    }

    System.out.println("good-by");

  }
}
