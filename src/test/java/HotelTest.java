import hotel.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;


public class HotelTest {

    Hotel hotel;
    Bedroom bedroom1;
    Bedroom bedroom2;
    Bedroom bedroom3;
    ConferenceRoom conferenceRoom1;
    ConferenceRoom conferenceRoom2;
    ConferenceRoom conferenceRoom3;
    Guest guest1;
    Guest guest2;
    Guest guest3;
    ArrayList<Bedroom> bedrooms;
    ArrayList<ConferenceRoom> conferenceRooms;



    @Before
    public void before(){

        bedroom1 = new Bedroom(1, RoomType.SINGLE);
        bedroom2 = new Bedroom(2, RoomType.DOUBLE);
        bedroom3 = new Bedroom(3, RoomType.SINGLE);
        conferenceRoom1 = new ConferenceRoom(2, "Jupiter");
        conferenceRoom2 = new ConferenceRoom(2, "Venus");
        conferenceRoom3 = new ConferenceRoom(2, "Mars");
        guest1 = new Guest("Maggie");
        guest2 = new Guest("Lisa");
        guest3 = new Guest("Bart");
        bedrooms = new ArrayList<Bedroom>();
        bedrooms.add(bedroom1);
        bedrooms.add(bedroom2);
        bedrooms.add(bedroom3);
        conferenceRooms = new ArrayList<ConferenceRoom>(Arrays.asList(conferenceRoom1, conferenceRoom2, conferenceRoom3));
        hotel = new Hotel(bedrooms, conferenceRooms);

    }

    @Test
    public void hasCollectionOfBedrooms(){
        assertEquals(3, hotel.getBedroomNumber() );
    }
    @Test
    public void hasCollectionOfConferenceRooms(){
        assertEquals(3, hotel.getConferenceRoomsNumber() );
    }
    @Test
    public void canCheckInGuests(){
        hotel.CheckInGuest(guest1, bedroom1) ;
        assertEquals(1, bedroom1.getNumOfVisitors());
        assertEquals(1, hotel.getBedrooms().get(0).getNumOfVisitors());
    }
    @Test
    public void canCheckOutGuests(){
        hotel.CheckInGuest(guest1, conferenceRoom1) ;
        hotel.CheckOutGuest(guest1);
        assertEquals(0, conferenceRoom1.getNumOfVisitors());
        assertEquals(0, hotel.getConferenceRooms().get(0).getNumOfVisitors());
    }

}
