import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;



public class TestBusStop {
    Bus testBus;
    Person dave;
    BusStop lothianRoad;

    @Before
    public void before(){
        testBus = new Bus("Stockbridge");
        dave = new Person("Dave");
        lothianRoad = new BusStop("Lothian Road");
    }


    @Test
    public void queueStartsEmpty(){
        assertEquals(0, lothianRoad.queueLength());
    }

    @Test
    public void canAddToQueue(){
        lothianRoad.addPerson(dave);
        assertEquals(1, lothianRoad.queueLength());
    }



}
