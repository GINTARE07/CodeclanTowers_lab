import hotel.Bedroom;
import hotel.Guest;
import hotel.RoomType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BedroomTest {
    Bedroom bedroom;
    Guest guest;
    @Before
    public void before(){
        bedroom = new Bedroom(1, RoomType.SINGLE);
        guest = new Guest("Paul");
    }
    @Test
    public void hasRoomNumber(){
        assertEquals(1, bedroom.getRoomNumber());

    }
    @Test
    public void hasCapacity(){
        assertEquals(1, bedroom.getCapacity());
    }
    @Test
    public void hasRoomType(){
        assertEquals(RoomType.SINGLE, bedroom.getRoomType());
    }
    @Test
    public void startsWithNoVisitors(){
        assertEquals(0, bedroom.getNumOfVisitors());
    }
    @Test
    public void roomHasSpace(){
        assertTrue(bedroom.hasSpaceAvailable());
    }
    @Test
    public void roomHasNoSpace(){
        bedroom.addGuest(guest);
        assertFalse(bedroom.hasSpaceAvailable());
        assertEquals(1, bedroom.getNumOfVisitors());
    }
    @Test
    public void canRemoveGuest(){
        bedroom.addGuest(guest);
        bedroom.removeGuest(guest);
        assertEquals(0, bedroom.getNumOfVisitors());
        assertTrue(bedroom.hasSpaceAvailable());
    }
}
