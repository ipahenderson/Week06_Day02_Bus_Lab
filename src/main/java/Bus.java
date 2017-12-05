import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;
    private int freeSeats;


    public Bus(String inputDestination){
        this.destination = inputDestination;
        this.passengers = new ArrayList<>();
        this.capacity = 1;
        this.freeSeats = 1;

    }


    public int passengerCount() {
       return this.passengers.size();
    }

    public void addPassenger(BusStop inputBusStop) {
        if (this.seatsAvailable() > 0) {
            this.passengers.add(inputBusStop.removePerson());
        }
    }

    public int seatsAvailable(){
        return this.freeSeats = (this.capacity - this.passengerCount());

    }


    public void removePassenger(Person inputPerson) {
        this.passengers.remove(inputPerson);
        seatsAvailable();
    }
}
