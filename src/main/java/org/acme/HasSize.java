package org.acme;

public interface HasSize extends HasElement {

    default void setSize(String size) {
        // set size for gotten element
        getElement();
    }
}
