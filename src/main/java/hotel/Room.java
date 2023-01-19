package hotel;

import java.util.ArrayList;

public abstract class Room {
    private int capacity;
    private ArrayList<Guest> visitors;

    public Room(int capacity) {
        this.capacity = capacity;
        this.visitors = new ArrayList<Guest>();
    }

    protected Room() {
    }

    public int getCapacity() {
        return capacity;
    }

    public ArrayList<Guest> getVisitors() {
        return visitors;
    }
    public int getNumOfVisitors(){
        return this.visitors.size();
    }
    public boolean hasSpaceAvailable() {
        return this.getNumOfVisitors() < this.capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public void addGuest(Guest guest){
        this.visitors.add(guest);
    }
    public void removeGuest(Guest guest){
        if(this.visitors.contains(guest)){
            this.visitors.remove(guest);
        }
    }
}
