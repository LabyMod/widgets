package net.labymod.serverapi.common.widgets.components.widgets;

import com.google.gson.annotations.SerializedName;
import net.labymod.serverapi.common.widgets.components.ContainerWidget;
import net.labymod.serverapi.common.widgets.util.Anchor;

import java.awt.Color;

/**
 * Color picker widget to choose a rgb color
 *
 * @author LabyStudio
 */
public class ColorPickerWidget extends ContainerWidget {

    /**
     * The title of the color picker
     */
    private String title;

    /**
     * The selected color of the color picker
     */
    @SerializedName("selected_color")
    private Color selectedColor;

    /**
     * Allow more than the default 15 minecraft colors
     */
    private boolean rgb;

    /**
     * @param id            Unique id of the widget
     * @param anchor        Anchor point for orientation
     * @param offsetX       X anchor offset in pixel
     * @param offsetY       Y anchor offset in pixel
     * @param width         The width of the container in pixels
     * @param height        The height of the container in pixels
     * @param title         The title of the color picker
     * @param selectedColor The selected color of the color picker
     */
    public ColorPickerWidget(int id, Anchor anchor, double offsetX, double offsetY, int width, int height, String title, Color selectedColor) {
        super(id, anchor, offsetX, offsetY, width, height);

        this.title = title;
        this.selectedColor = selectedColor;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Color getSelectedColor() {
        return selectedColor;
    }

    public void setSelectedColor(Color selectedColor) {
        this.selectedColor = selectedColor;
    }

    public boolean isRgb() {
        return rgb;
    }

    public void setRgb(boolean rgb) {
        this.rgb = rgb;
    }
}
