import java.util.ArrayList;
public class AddressBook {

    public ArrayList<BuddyInfo> buddies;

    public AddressBook() {
        buddies = new ArrayList<BuddyInfo>();
    }

    public void addBuddy(BuddyInfo bud) {
        if (bud != null) {
            buddies.add(bud);
        }
    }

    public void removeBuddy(int index) {
        if (index >= 0 && index < buddies.size()) {
            buddies.remove(index);
        }
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Tom","carleton","613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(0);
    }

}