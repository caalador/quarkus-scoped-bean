package org.acme;

import java.io.Serializable;

@FunctionalInterface
public interface HasElement extends Serializable {

    Object getElement();

}
