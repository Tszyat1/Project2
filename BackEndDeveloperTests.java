import org.junit.Test;

import static org.junit.Assert.*;

/**
 * This class is for setting tests for cs400 project two Backend.
 */
public class BackEndDeveloperTests {

    /**
     * This class instantiate a backend with some members. It then tries to add members into the system, and the
     * member will go into blacklist. It passes if the member is correctly added into the blacklist, and fails it is
     * not.
     */
    @Test
    public void testIDAddMember() {
        try {
            BackendInterface backend = null;
            backend.addMember("Simon, 1010, Male, 18, 18006095221, -2000");
            assertEquals("[Simon, 1010, Male, 18, 18006095221, -2000]", backend.getBlackList().get(0).toString());
        } catch (Exception e) {
            fail("There is an unexpected exception");
        }
    }

    /**
     * This class instantiate the backend with three members. It then tries to get the member with its ID. It passes
     * if the member is the correct one. It fails if it is not.
     */
    @Test
    public void testIDGetMember() {
        try {
            BackendInterface backend = null;
            assertEquals("Simon, 1010, Male, 18, 18006095221, 10000", backend.getMember(1010).toString());
        } catch (Exception e) {
            fail("There is an unexpected exception");
        }
    }

    /**
     * This class instantiate a backend with one member. It then tries to get its ID. The test passes if the ID is
     * correct, and fails otherwise
     */
    @Test
    public void testGetID() {
        try {
            BackendInterface backend = null;
            assertEquals("1010", backend.getMember(1010).getID() + "");
        } catch (Exception e) {
            fail("There is an unexpected exception");
        }
    }

    /**
     * This class instantiate a backend with some members. It then tries to get its Balance. The test passes if the
     * balance is
     * correct, and fails otherwise
     */
    @Test
    public void testGetBalance() {
        try {
            BackendInterface backend = null;
            assertEquals("10000", backend.getMember(1010).getBalance() + "");
        } catch (Exception e) {
            fail("There is an unexpected exception");
        }
    }

    /**
     * This class instantiate a backend with some members. It then tries to edit its Balance. The test passes if the
     * balance is
     * correctly edited, and fails otherwise
     */
    @Test
    public void testEditBalance() {
        try {
            BackendInterface backend = null;
            backend.editBalance(1010, 2000.0);
            assertEquals("12000", backend.getMember(1010).getBalance() + "");
        } catch (Exception e) {
            fail("There is an unexpected exception");
        }
    }


}
