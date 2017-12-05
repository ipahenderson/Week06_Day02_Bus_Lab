import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TestBus {

    Bus testBus;
    Person dave;
    Person john;
    BusStop lothianRoad;

    @Before
    public void before(){
        testBus = new Bus("Stockbridge");
        dave = new Person("Dave");
        lothianRoad = new BusStop("Lothian Road");
        john = new Person("John");
    }

    @Test
    public void passengersStartsEmpty(){
        assertEquals(0, testBus.passengerCount());
    }


    @Test
    public void canAddPassenger(){
        lothianRoad.addPerson(dave);
        testBus.addPassenger(lothianRoad);
        assertEquals(1, testBus.passengerCount());
    }


    @Test
    public void canRemovePassenger(){
        lothianRoad.addPerson(dave);
        testBus.addPassenger(lothianRoad);
        testBus.removePassenger(dave);
        assertEquals(0, testBus.passengerCount());
    }


    @Test
    public void busHasNoCapacity(){
        lothianRoad.addPerson(dave);
        lothianRoad.addPerson(john);
        testBus.addPassenger(lothianRoad);
        testBus.addPassenger(lothianRoad);
        assertEquals(1, testBus.passengerCount());
    }

    @Test
    public void busFreeSeats(){
        lothianRoad.addPerson(john);
        testBus.addPassenger(lothianRoad);
        assertEquals(0, testBus.seatsAvailable());
    }
}
