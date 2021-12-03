package com.ita.edu.teachua.ui.elements.base_element;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsElement;
import org.openqa.selenium.interactions.Locatable;


/**
 * wraps a web element interface with extra functionality. Anything added here will be added to all descendants.
 */
@ImplementedBy(BaseElement.class)
public interface Element extends WebElement, WrapsElement, Locatable {
    /**
     * Returns true when the inner element is ready to be used.
     *
     * @return boolean true for an initialized WebElement, or false if we were somehow passed a null WebElement.
     */
    boolean elementWired();
}
