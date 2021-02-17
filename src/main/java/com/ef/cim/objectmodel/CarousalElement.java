package com.ef.cim.objectmodel;

import java.util.ArrayList;
import java.util.List;

public class CarousalElement {
  private ImageButton imageButton;
  private String title;
  private CarousalDescriptionButton descriptioButton;
  private List<CarousalButton> buttons;
  private CarouselDefaultAction defaultAction;

  /**
   * Constructor, Initialize all the instance member objects except Strings Initialize all the List
   * objects to empty lists Requires image url to initialize the image property of type {@code
   * ImageButton}
   *
   */
  public CarousalElement() {
    this.imageButton = new ImageButton();
    this.descriptioButton = new CarousalDescriptionButton();
    this.buttons = new ArrayList<CarousalButton>();
    this.defaultAction = new CarouselDefaultAction();
  }

  /**
   * Returns the image button of the carousal element
   *
   * @return {@code ImageButton}
   */
  public ImageButton getImageButton() {
    return this.imageButton;
  }

  /**
   * Returns the title of the carousal element
   *
   * @return {@code String}
   */
  public String getTitle() {
    return this.title;
  }

  /**
   * Returns the text button of the carousal element
   *
   * @return {@code Button}
   */
  public CarousalDescriptionButton getDescriptionButton() {
    return this.descriptioButton;
  }

  /**
   * Returns the action button list of the carousal element
   *
   * @return {@code List<Button>}
   */
  public List<CarousalButton> getButtons() {
    return this.buttons;
  }

  /**
   * Returns the default action button of the carousal element
   *
   * @return {@code Button}
   */
  public CarouselDefaultAction getDefaultAction() {
    return this.defaultAction;
  }

  /**
   * Sets the image button of the carousal element
   *
   * @param imageButton, object of type {@code ImageButton}
   */
  public void setImageButton(ImageButton imageButton) {
    this.imageButton = imageButton;
  }

  /**
   * Sets the title of the carousal element
   *
   * @param title, object of type {@code String}
   */
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * Sets the text button of the carousal element
   *
   * @param descriptioButton, object of type {@code Button}
   */
  public void setDescriptioButton(CarousalDescriptionButton descriptioButton) {
    this.descriptioButton = descriptioButton;
  }

  /**
   * Sets the action button list of the carousal element
   *
   * @param actionButtons, object of type {@code List<Button>}
   */
  public void setButtons(List<CarousalButton> actionButtons) {
    this.buttons = actionButtons;
  }

  /**
   * Sets the default action button of the carousal element
   *
   * @param defaultAction, object of type {@code Button}
   */
  public void setDefaultAction(CarouselDefaultAction defaultAction) {
    this.defaultAction = defaultAction;
  }

  /**
   * Adds a button to the list of action buttons
   *
   * @param button, object of type {@code Button}
   */
  public void addButton(CarousalButton button) {
    if (this.buttons == null) {
      this.buttons = new ArrayList<CarousalButton>();
    }
    this.buttons.add(button);
  }

  /**
   * Takes a {@code Button} object as input and removes it from the list of action buttons
   *
   * @param button, object of type {@code Button}
   */
  public void removeButton(CarousalButton button) {
    if (this.buttons != null) {
      this.buttons.remove(button);
    }
  }

  /**
   * Takes an index as input, and removes the object on that index in the action buttons list
   *
   * @param index, of type {@code int}
   */
  public void removeButton(int index) {
    if (this.buttons != null) {
      this.buttons.remove(index);
    }
  }
}
