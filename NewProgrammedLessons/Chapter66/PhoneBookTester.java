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
    phoneBook = new PhoneEntry[7] ;

    phoneBook[0] = new PhoneEntry( "James", "Barclay", "(418) 665-1223" );
    phoneBook[1] = new PhoneEntry( "Grace", "Dunbar", "(860) 399-3044" );
    phoneBook[2] = new PhoneEntry( "Paul", "Kratides", "(815) 439-9271" );
    phoneBook[3] = new PhoneEntry( "Violet", "Smith", "(312) 223-1937" );
    phoneBook[4] = new PhoneEntry( "John", "Wood", "(913) 883-2874" );
    phoneBook[5] = new PhoneEntry( "John", "Smith", "(812) 339-4916");
    phoneBook[6] = new PhoneEntry( "Willoughby", "Smith", "(312) 992-8761");

  }

  public int getLength() {
    return 7;
  }

  public PhoneEntry getEntry(int i) {
    return phoneBook[i];
  }

  public void setEntry(int i, String first, String last, String phone) {
    phoneBook[i] = new PhoneEntry(first, last, phone);
  }

  public void setNull(int i) {
    phoneBook[i] = null;
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

  public int personLocation(String targetFirstName, String targetLastName) {
    int personLocation = -1;
    for ( int j=0; j < phoneBook.length; j++ )
    {
      if ( phoneBook[j] != null && phoneBook[j].getFirstName().toUpperCase().equals(targetFirstName.toUpperCase()) && phoneBook[j].getLastName().toUpperCase().equals(targetLastName.toUpperCase())) {
        personLocation = j;
        j = phoneBook.length;
      }
    }
    return personLocation;
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
  
    System.out.println("Do you want to search for a name, add a name, or delete a name? (Say \"quit\" to exit)");
    String task = scan.nextLine();

    while (! task.equals("quit")) {
      if (task.toUpperCase().equals("SEARCH")) {
        System.out.println("Last Name?");
        String searchLastName = scan.nextLine();
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
          System.out.println("Name not found");
          }
            }  
        System.out.println("");
      } else if (task.toUpperCase().equals("ADD")) {
        Boolean nullCell = false;
        int whichCell = -1;
        for (int i = 0; i < pb.getLength(); i++) {
          if (pb.getEntry(i) == null) {
            nullCell = true;
            whichCell = i;
            i = pb.getLength();
          }
        }
        if (nullCell) {
          System.out.println("What is the last name?");
          String addLast = scan.nextLine();
          System.out.println("What is the first name?");
          String addFirst = scan.nextLine();
          System.out.println("What is the phone number?");
          String addPhone = scan.nextLine();
          pb.setEntry(whichCell, addFirst, addLast, addPhone);
          System.out.println("You successfully added " + addFirst + " " + addLast + " to the phone book.");
        } else {
          System.out.println("Sorry, there was an error. Make sure the phonebook is not full.");
        }
      } else if (task.toUpperCase().equals("DELETE")) {
        System.out.println("What is the last name of the person you want to delete?");
        String deleteLast = scan.nextLine();
        System.out.println("What is the first name of the person you want to delete?");
        String deleteFirst = scan.nextLine();
        int place = pb.personLocation(deleteFirst, deleteLast);
        if (place == -1) {
          System.out.println("That person does not exist in the phone book.");
        } else {
          pb.setNull(place);
          System.out.println("You successfully deleted " + deleteFirst + " " + deleteLast + " from the phone book.");
        }
      } else {
        System.out.println("Please say search, add, or delete.");
      }
      System.out.println("Do you want to search for a name, add a name, or delete a name? (Say \"quit\" to exit)");
      task = scan.nextLine();
    }
    
    System.out.println("good-by");

  }
}
