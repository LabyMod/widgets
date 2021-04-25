package net.labymod.serverapi.common.widgets.components;

import net.labymod.serverapi.common.widgets.util.Anchor;

/**
 * Abstract widget component
 *
 * @author LabyStudio
 */
public abstract class Widget {

    /**
     * The unique widget id to track interactions
     */
    protected int id;

    /**
     * Anchor orientation position
     */
    private Anchor anchor;

    /**
     * Anchor x offset position in pixel
     */
    private double offsetX;

    /**
     * Anchor y offset position in pixel
     */
    private double offsetY;

    /**
     * Abstract widget
     *
     * @param id      Unique id of the widget
     * @param anchor  Anchor point for orientation
     * @param offsetX X anchor offset in pixel
     * @param offsetY Y anchor offset in pixel
     */
    public Widget(int id, Anchor anchor, double offsetX, double offsetY) {
        this.id = id;
        this.anchor = anchor;
        this.offsetX = offsetX;
        this.offsetY = offsetY;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAnchor(Anchor anchor) {
        this.anchor = anchor;
    }

    public void setOffsetX(double offsetX) {
        this.offsetX = offsetX;
    }

    public void setOffsetY(double offsetY) {
        this.offsetY = offsetY;
    }

    public int getId() {
        return id;
    }

    public Anchor getAnchor() {
        return anchor;
    }

    public double getOffsetX() {
        return offsetX;
    }

    public double getOffsetY() {
        return offsetY;
    }
}
