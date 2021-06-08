package org.acme;

public class Component implements HasElement {
    
    @Override
    public Object getElement() {
        return "an element";
    }
}
