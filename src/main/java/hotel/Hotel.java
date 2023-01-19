package hotel;

import java.util.ArrayList;

public class Hotel {
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel(ArrayList<Bedroom> bedrooms, ArrayList<ConferenceRoom> conferenceRooms) {
        this.bedrooms = bedrooms;
        this.conferenceRooms = conferenceRooms;
    }

    public ArrayList<Bedroom> getBedrooms() {
        return bedrooms;
    }

    public ArrayList<ConferenceRoom> getConferenceRooms() {
        return conferenceRooms;
    }
    public int getBedroomNumber(){
        return this.bedrooms.size();
    }
    public int getConferenceRoomsNumber(){
        return this.conferenceRooms.size();
        
    }
    public void CheckInGuest(Guest guest, Room room){
        if(this.getBedrooms().contains(room) && room.hasSpaceAvailable()){
            room.addGuest(guest);
        } else if (this.getConferenceRooms().contains(room) && room.hasSpaceAvailable()){
            room.addGuest(guest);
        }
    }
    public void CheckOutGuest(Guest guest) {
        for (Bedroom bedroom : this.bedrooms) {
            if (bedroom.getVisitors().contains(guest)) {
                bedroom.removeGuest(guest);
            }
        }
        for (ConferenceRoom conferenceRoom : this.conferenceRooms) {
            if (conferenceRoom.getVisitors().contains(guest)) {
                conferenceRoom.removeGuest(guest);
            }
        }

    }

}
