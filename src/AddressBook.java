import java.util.ArrayList;
public class AddressBook {

    public ArrayList buddies;

    public AddressBook() {
        buddies = new ArrayList();
    }

    public void addBuddy(BuddyInfo bud) {
        if (buddies.add(bud)) {
            System.out.println("Buddy info added");
        } else {
            System.out.println("Buddy info not added");
        }
    }

    public void removeBuddy(BuddyInfo bud) {
        if (buddies.remove(bud)) {
            System.out.println("Buddy info removed");
        } else {
            System.out.println("Buddy info not removed");
        }
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Tom","carleton","613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
    }

}