import java.util.List;

/**
 * This interface is for creating the backend.
 */
public interface BackendInterface {
    /**
     * Use String (phone number) as the parameter to search the Member information by first finding member’s id from
     * phone number from hash table and then use id to find member information in red-black tree.
     *
     * @return member with the given phone number
     */
    public MemberInterface getMember(String phoneNumber);

    /**
     * Use Integer (id) as the parameter to  search member’s information using id from red-black tree.
     *
     * @param ID the ID for the member
     * @return member with the given ID
     */
    public MemberInterface getMember(Integer ID);

    /**
     * Add a new member with the String parameter as the information.
     *
     * @param information for the new member
     */
    public void addMember(String information);

    /**
     * Edit the balance of a member
     *
     * @param ID              the ID for the member
     * @param changeOfBalance the amount of money changed
     */
    public void editBalance(Integer ID, Double changeOfBalance);

    /**
     * Gets all members in the black list
     *
     * @return a list of members in black list
     */
    public List<MemberInterface> getBlackList();

}
