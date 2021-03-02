package com.ef.cim.objectmodel;

import java.util.ArrayList;
import java.util.List;

/**
 * A {@code CarousalMessage} object represents the body of a message that is of CAROUSAL type
 */
public class CarousalMessage extends StructuredMessage {
    private int maxWidth;
    private int maxHeight;
    private List<CarousalElement> elements;

    /**
     * Default Constructor, Sets the message type to CAROUSAL Initialize the list of carousal elements
     * as an empty list
     */
    public CarousalMessage() {
        super(MessageType.CAROUSAL);
        this.elements = new ArrayList<CarousalElement>();
    }

    /**
     * Returns the max width of the carousal message
     *
     * @return {@code int}
     */
    public int getMaxWidth() {
        return this.maxWidth;
    }

    /**
     * Sets the max width of the carousal message
     *
     * @param maxWidth, of type {@code int}
     */
    public void setMaxWidth(int maxWidth) {
        this.maxWidth = maxWidth;
    }

    /**
     * Returns the max height of the carousal message
     *
     * @return {@code int}
     */
    public int getMaxHeight() {
        return this.maxHeight;
    }

    /**
     * Sets the max width of the carousal message
     *
     * @param maxHeight, of type {@code int}
     */
    public void setMaxHeight(int maxHeight) {
        this.maxHeight = maxHeight;
    }

    /**
     * Returns the list of carousal elements of the carousal message
     *
     * @return {@code List<CarousalElement>}
     */
    public List<CarousalElement> getElements() {
        return this.elements;
    }

    /**
     * Sets the list of carousal elements of the carousal message
     *
     * @param elements, object of type {@code List<CarousalElement>}
     */
    public void setElements(List<CarousalElement> elements) {
        this.elements = elements;
    }

    /**
     * Adds an element to the list of carousal elements
     *
     * @param element, object of type {@code CarousalElement}
     */
    public void addElement(CarousalElement element) {
        if (this.elements == null) {
            this.elements = new ArrayList<CarousalElement>();
        }
        this.elements.add(element);
    }

    /**
     * Takes a carousal element as input, and removes it from the list of carousal elements
     *
     * @param element, object of type {@code CarousalElement}
     */
    public void removeElement(CarousalElement element) {
        if (this.elements != null) {
            this.elements.remove(element);
        }
    }

    /**
     * Takes an index as input, and remove the object on that index in the list of carousal elements
     *
     * @param index, of type {@code int}
     */
    public void removeElement(int index) {
        if (this.elements != null) {
            this.elements.remove(index);
        }
    }

    @Override
    public String toString() {
        return "CarousalMessage{" +
                "maxWidth=" + maxWidth +
                ", maxHeight=" + maxHeight +
                ", elements=" + elements +
                ", type=" + type +
                ", markdownText='" + markdownText + '\'' +
                '}';
    }
}
