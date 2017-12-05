import java.util.ArrayList;

public class BusStop {

    private String stopName;
    private ArrayList<Person> queue;


    public BusStop(String inputStopName){
        this.stopName = inputStopName;
        this.queue = new ArrayList<>();
    }



    public Person removePerson() {
       return this.queue.remove(0);
    }

    public int queueLength() {
       return this.queue.size();
    }

    public void addPerson(Person inputPerson) {
        this.queue.add(inputPerson);
    }
}
