package net.labymod.serverapi.common.widgets.components.widgets;

import com.google.gson.annotations.SerializedName;
import net.labymod.serverapi.common.widgets.components.ValueContainerWidget;
import net.labymod.serverapi.common.widgets.util.Anchor;

/**
 * Text field widget for user text input
 *
 * @author LabyStudio
 */
public class TextFieldWidget extends ValueContainerWidget {

    /**
     * The placeholder that will be displayed when the field is not in focus and the value of the field is empty.
     */
    protected String placeholder;

    /**
     * The max length of the text field value
     */
    @SerializedName("max_length")
    protected int maxLength;

    /**
     * Focus the text field on load
     */
    protected boolean focused;

    /**
     * @param id          Unique id of the widget
     * @param anchor      Anchor point for orientation
     * @param offsetX     X anchor offset in pixel
     * @param offsetY     Y anchor offset in pixel
     * @param value       The display value of the container
     * @param width       The width of the container in pixels
     * @param height      The height of the container in pixels
     * @param placeholder The placeholder that will be displayed when the field is not in focus and the value of the field is empty.
     * @param maxLength   The max length of the text field value
     * @param focused     Focus the text field on load
     */
    public TextFieldWidget(int id, Anchor anchor, double offsetX, double offsetY, String value, int width, int height, String placeholder,
                           int maxLength, boolean focused) {
        super(id, anchor, offsetX, offsetY, value, width, height);

        this.placeholder = placeholder;
        this.maxLength = maxLength;
        this.focused = focused;
    }

    public void setPlaceholder(String placeholder) {
        this.placeholder = placeholder;
    }

    public void setMaxLength(int maxLength) {
        this.maxLength = maxLength;
    }

    public void setFocused(boolean focused) {
        this.focused = focused;
    }

    public String getPlaceholder() {
        return placeholder;
    }

    public int getMaxLength() {
        return maxLength;
    }

    public boolean isFocused() {
        return focused;
    }
}
