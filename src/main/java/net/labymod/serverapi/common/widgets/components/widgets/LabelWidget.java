package net.labymod.serverapi.common.widgets.components.widgets;


import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import net.labymod.serverapi.common.widgets.components.Widget;
import net.labymod.serverapi.common.widgets.util.Anchor;

/**
 * Widget to display a string
 *
 * @author LabyStudio
 */
public class LabelWidget extends Widget {

    /**
     * The string to display
     */
    private JsonElement value;

    /**
     * String alignment.
     * - 0: Left alignment
     * - 1: Center alignment
     * - 2: Right alignment
     */
    private int alignment;

    /**
     * The scale of the string.
     * The default scale is 1.0. To make it smaller by half, 0.5 must be specified.
     */
    private double scale;

    /**
     * Create a label widget to display a string.
     *
     * @param sourceWidget Widget as anchor and offset source
     * @param value        The value of the label as string
     * @param alignment    String alignment (0:LEFT, 1:CENTER, 2:RIGHT)
     * @param scale        String scale (Default 1.0)
     */
    public LabelWidget(Widget sourceWidget, String value, int alignment, double scale) {
        this(sourceWidget.getId(), sourceWidget.getAnchor(), sourceWidget.getOffsetX(), sourceWidget.getOffsetY(), value, alignment, scale);
    }

    /**
     * Create a label widget to display a string.
     *
     * @param id        Unique id of the widget
     * @param anchor    Anchor point for orientation
     * @param offsetX   X anchor offset in pixel
     * @param offsetY   Y anchor offset in pixel
     * @param value     The value of the label (It is possible to change the color of the string by using the § character.)
     * @param alignment String alignment (0:LEFT, 1:CENTER, 2:RIGHT)
     * @param scale     String scale (Default 1.0)
     */
    public LabelWidget(int id, Anchor anchor, double offsetX, double offsetY, String value, int alignment, double scale) {
        this(id, anchor, offsetX, offsetY, new JsonPrimitive(value), alignment, scale);
    }

    /**
     * Create a label widget to display a string.
     *
     * @param id        Unique id of the widget
     * @param anchor    Anchor point for orientation
     * @param offsetX   X anchor offset in pixel
     * @param offsetY   Y anchor offset in pixel
     * @param value     The value of the label as raw text
     * @param alignment String alignment (0:LEFT, 1:CENTER, 2:RIGHT)
     * @param scale     String scale (Default 1.0)
     */
    public LabelWidget(int id, Anchor anchor, double offsetX, double offsetY, JsonElement value, int alignment, double scale) {
        super(id, anchor, offsetX, offsetY);

        this.value = value;
        this.alignment = alignment;
        this.scale = scale;
    }

    /**
     * Get label value as raw text
     *
     * @return Serialized raw text label
     */
    public JsonElement getValue() {
        return value;
    }

    public void setValue(JsonElement value) {
        this.value = value;
    }

    public void setValue(String value) {
        this.value = new JsonPrimitive(value);
    }

    public void setAlignment(int alignment) {
        this.alignment = alignment;
    }

    public void setScale(double scale) {
        this.scale = scale;
    }

    public int getAlignment() {
        return alignment;
    }

    public double getScale() {
        return scale;
    }
}
