import java.util.ArrayList;
public class AddressBook {

    public ArrayList buddies;

    public AddressBook () {
        buddies = new ArrayList ();
    }

    public void addBuddy (BuddyInfo bud) {
        if (buddies.add(bud)) {
            System.out.print("Buddy info added");
        } else {
            System.out.println("Buddy info not added");
        }
    }

    public void removeBuddy (BuddyInfo bud)
    {
        if(buddies.remove(bud)) {
            System.out.print("Buddy info removed");
        } else {
            System.out.println ("Buddy info not removed");
        }
    }
}
