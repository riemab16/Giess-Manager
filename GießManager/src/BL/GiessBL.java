
package BL;

import java.util.ArrayList;
import observer.GiessObserver;
import observer.GiessSubject;

public class GiessBL implements GiessSubject{
    private ArrayList<GiessManagerEntry> manager = new ArrayList<>();
    
    private ArrayList<GiessObserver> observers = new ArrayList<>();
    
    public void addEntry(GiessManagerEntry m){
        manager.add(m);
        inform(m);
    }
    @Override
    public void register(GiessObserver observer) {
        observers.add(observer);
    }

    @Override
    public void deregister(GiessObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void inform(GiessManagerEntry m) {
        for (GiessObserver observer : observers) {
            observer.update(m);          
        }
    }
    
}
