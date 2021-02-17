package com.ef.cim.objectmodel;

import java.util.ArrayList;
import java.util.List;

public class ButtonMessage extends StructuredMessage {
  private List<Button> buttons;
  private String text;
  private boolean composerInputDisabled;

  /** Default Constructor Initializes an empty buttons list. */
  public ButtonMessage() {
    super(MessageType.BUTTON);
    buttons = new ArrayList<Button>();
    text = "";
    composerInputDisabled = true;
  }

  /**
   * Returns the list of buttons
   *
   * @return {@code List<Button>}
   */
  public List<Button> getButtons() {
    return this.buttons;
  }

  /**
   * Sets the list of buttons
   *
   * @param buttons, object of type {@code List<Button>}
   */
  public void setButtons(List<Button> buttons) {
    this.buttons = buttons;
  }

  /**
   * Adds a {@code Button} object in the list of buttons
   *
   * @param button, object of type {@code Button}
   */
  public void addButton(Button button) {
    if (this.buttons == null) {
      this.buttons = new ArrayList<Button>();
    }

    this.buttons.add(button);
  }

  /**
   * Removes a {@code Button} object from the list of buttons
   *
   * @param button, object of type {@code Button}
   */
  public void removeButton(Button button) {
    if (this.buttons != null) {
      this.buttons.remove(button);
    }
  }

  /**
   * Removes a {@code Button} object from the list of buttons
   *
   * @param index, of type {@code int}
   */
  public void removeButton(int index) {
    if (this.buttons != null) {
      this.buttons.remove(index);
    }
  }
  /**
   * set the text of button message
   * 
   * @param text, object of type {@code String}
   */
  public void setText(String text) {
    this.text = text;
  }

  /**
   * Return the text of button message
   * 
   * @return {@code String}
   */
  public String getText() {
    return this.text;
  }

  /**
   * set the composerInputDisabled of button message
   * 
   * @param text, of type {@code boolean}
   */
  public void setComposerInputDisabled(boolean composerInputDisabled) {
    this.composerInputDisabled = composerInputDisabled;
  }

  /**
   * Return the composerInputDisabled of button message
   * 
   * @return {@code String}
   */
  public boolean getComposerInputDisabled() {
    return this.composerInputDisabled;
  }

  /**
   * Converts the {@code ButtonMessage} object to string
   *
   * @return {@code String}
   */
  @Override
  public String toString() {
    return "ButtonMessage{" + "text=" + text + ", buttons=" + buttons + ", composerInputDisabled='" + composerInputDisabled + '\'' + '}';
  }
}
