package net.labymod.serverapi.common.widgets.components.widgets;

import com.google.gson.JsonArray;
import com.google.gson.annotations.SerializedName;
import net.labymod.serverapi.common.widgets.components.ContainerWidget;
import net.labymod.serverapi.common.widgets.util.Anchor;

/**
 * Widget to add a dropdown to the screen
 *
 * @author L3nnart_
 */
public class DropdownWidget extends ContainerWidget {

    /**
     * The placeholder that will be displayed when no field is selected in dropdown.
     */
    protected String placeholder;

    /**
     * The strings to display in dropdown
     */
    private JsonArray values;

    /**
     * Close the screen on select of a dropdown value.
     */
    @SerializedName("close_screen_on_select")
    private boolean closeScreenOnSelect;

    /**
     * @param id          Unique id of the widget
     * @param anchor      Anchor point for orientation
     * @param offsetX     X anchor offset in pixel
     * @param offsetY     Y anchor offset in pixel
     * @param values      The display value of the container
     * @param width       The width of the container in pixels
     * @param height      The height of the container in pixels
     * @param placeholder The placeholder that will be displayed when the field is not in focus and the value of the field is empty.
     */
    public DropdownWidget(int id, Anchor anchor, double offsetX, double offsetY, JsonArray values, int width, int height, String placeholder) {
        super(id, anchor, offsetX, offsetY, width, height);

        this.placeholder = placeholder;
        this.values = values;
    }

    public void setValue(JsonArray values) {
        this.values = values;
    }

    public JsonArray getValues() {
        return values;
    }

    public void setPlaceholder(String placeholder) {
        this.placeholder = placeholder;
    }

    public String getPlaceholder() {
        return placeholder;
    }

    public void setCloseScreenOnClick(boolean closeScreenOnSelect) {
        this.closeScreenOnSelect = closeScreenOnSelect;
    }

    public boolean isCloseScreenOnClick() {
        return closeScreenOnSelect;
    }
}