
package BL;

import java.util.ArrayList;
import observer.GießObserver;
import observer.GießSubject;

public class GießBL implements GießSubject{
    private ArrayList<GießManager> manager = new ArrayList<>();
    
    private ArrayList<GießObserver> observers = new ArrayList<>();
    
    public void addEntry(GießManager m){
        manager.add(m);
        inform(m);
    }
    @Override
    public void register(GießObserver observer) {
        observers.add(observer);
    }

    @Override
    public void deregister(GießObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void inform(GießManager m) {
        for (GießObserver observer : observers) {
            observer.update(m);          
        }
    }
    
}
