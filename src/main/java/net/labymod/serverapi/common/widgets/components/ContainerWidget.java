package net.labymod.serverapi.common.widgets.components;

import net.labymod.serverapi.common.widgets.util.Anchor;

/**
 * Abstract container widget. Used to handle with and height values of a widget.
 *
 * @author LabyStudio
 */
public abstract class ContainerWidget extends Widget {

    /**
     * Container width in pixels
     */
    protected int width;

    /**
     * Container height in pixels
     */
    protected int height;

    /**
     * @param id      Unique id of the widget
     * @param anchor  Anchor point for orientation
     * @param offsetX X anchor offset in pixel
     * @param offsetY Y anchor offset in pixel
     * @param width   The width of the container in pixels
     * @param height  The height of the container in pixels
     */
    public ContainerWidget(int id, Anchor anchor, double offsetX, double offsetY, int width, int height) {
        super(id, anchor, offsetX, offsetY);
        this.width = width;
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
