
package observer;

import BL.GießManager;

public interface GießSubject {
    
    public void register(GießObserver observer);
    
    public void deregister(GießObserver observer);
    
    public void inform(GießManager m);
}
