
package observer;

import BL.GiessManagerEntry;

public interface GiessSubject {
    
    public void register(GiessObserver observer);
    
    public void deregister(GiessObserver observer);
    
    public void inform(GiessManagerEntry m);
}
