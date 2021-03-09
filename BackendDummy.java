import java.io.Reader;
import java.util.List;

/**
 * This dummy class is for starting the cs400 project two
 */
public class BackendDummy implements BackendInterface{

    /**
     * Constructor for the dummy class
     * @param inputFileReader reader for taking data
     */
    public BackendDummy(Reader inputFileReader){

    }

    /**
     * Constructor for the dummy class taking command line input
     * @param args path to CSV file
     */
    public BackendDummy(String[] args){

    }

    /**
     * Use String (phone number) as the parameter to search the Member information by first finding member’s id from
     * phone number from hash table and then use id to find member information in red-black tree.
     *
     * @param phoneNumber
     * @return member with the given phone number
     */
    @Override
    public MemberInterface getMember(String phoneNumber) {
        return null;
    }

    /**
     * Use Integer (id) as the parameter to  search member’s information using id from red-black tree.
     *
     * @param ID the ID for the member
     * @return member with the given ID
     */
    @Override
    public MemberInterface getMember(Integer ID) {
        return null;
    }

    /**
     * Add a new member with the String parameter as the information.
     *
     * @param information for the new member
     */
    @Override
    public void addMember(String information) {

    }

    /**
     * Edit the balance of a member
     *
     * @param ID              the ID for the member
     * @param changeOfBalance the amount of money changed
     */
    @Override
    public void editBalance(Integer ID, Double changeOfBalance) {

    }

    /**
     * Gets all members in the black list
     *
     * @return a list of members in black list
     */
    @Override
    public List<MemberInterface> getBlackList() {
        return null;
    }
}
