package net.labymod.serverapi.common.widgets.components.widgets;

import com.google.gson.annotations.SerializedName;
import net.labymod.serverapi.common.widgets.components.ValueContainerWidget;
import net.labymod.serverapi.common.widgets.util.Anchor;

/**
 * Widget to add a button to the screen
 *
 * @author LabyStudio
 */
public class ButtonWidget extends ValueContainerWidget {

    /**
     * Close the screen on an interaction with the button
     */
    @SerializedName("close_screen_on_click")
    private boolean closeScreenOnClick;

    /**
     * @param id      Unique id of the widget
     * @param anchor  Anchor point for orientation
     * @param offsetX X anchor offset in pixel
     * @param offsetY Y anchor offset in pixel
     * @param value   The display value of the container
     * @param width   The width of the container in pixels
     * @param height  The height of the container in pixels
     */
    public ButtonWidget(int id, Anchor anchor, double offsetX, double offsetY, String value, int width, int height) {
        super(id, anchor, offsetX, offsetY, value, width, height);

        this.value = value;
    }

    public void setCloseScreenOnClick(boolean closeScreenOnClick) {
        this.closeScreenOnClick = closeScreenOnClick;
    }

    public boolean isCloseScreenOnClick() {
        return closeScreenOnClick;
    }
}
