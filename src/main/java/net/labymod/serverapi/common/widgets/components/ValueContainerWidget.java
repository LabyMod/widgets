package net.labymod.serverapi.common.widgets.components;

import net.labymod.serverapi.common.widgets.util.Anchor;

/**
 * Abstract container with a string value to display
 *
 * @author LabyStudio
 */
public abstract class ValueContainerWidget extends ContainerWidget {

    /**
     * The display value of the container
     */
    protected String value;

    /**
     * Abstract container with a string value
     *
     * @param id      Unique id of the widget
     * @param anchor  Anchor point for orientation
     * @param offsetX X anchor offset in pixel
     * @param offsetY Y anchor offset in pixel
     * @param value   The display value of the container
     * @param width   The width of the container in pixels
     * @param height  The height of the container in pixels
     */
    public ValueContainerWidget(int id, Anchor anchor, double offsetX, double offsetY, String value, int width, int height) {
        super(id, anchor, offsetX, offsetY, width, height);

        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
