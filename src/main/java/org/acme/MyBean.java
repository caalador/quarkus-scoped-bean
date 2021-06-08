package org.acme;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Singleton;

@ApplicationScoped
//@Singleton
public class MyBean extends Component implements HasSize {
    
    public MyBean() {
        setSize("5px");
    }
    
}
