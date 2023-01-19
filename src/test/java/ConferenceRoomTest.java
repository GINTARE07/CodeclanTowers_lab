import hotel.ConferenceRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {
    ConferenceRoom conferenceRoom;

    @Before
    public void before(){
        conferenceRoom = new ConferenceRoom(2, "Jupiter");
    }
    @Test
    public void hasCapacity(){
        assertEquals(2, conferenceRoom.getCapacity());
    }
    @Test
    public void hasName(){
        assertEquals("Jupiter", conferenceRoom.getName());
    }
    @Test
    public void startsWithNoVisitors(){
        assertEquals(0, conferenceRoom.getNumOfVisitors());
    }

}
