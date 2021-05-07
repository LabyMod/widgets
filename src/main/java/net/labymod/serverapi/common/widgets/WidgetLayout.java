package net.labymod.serverapi.common.widgets;

import com.google.gson.annotations.SerializedName;

/**
 * Widget layout used for the wrapped inventory
 *
 * @author LabyStudio
 */
public class WidgetLayout {

    @SerializedName("slot_width")
    private int slotWidth = 10;
    @SerializedName("slot_height")
    private int slotHeight = 10;

    @SerializedName("slot_margin_x")
    private int slotMarginX = 5;
    @SerializedName("slot_margin_y")
    private int slotMarginY = 5;

    @SerializedName("border_padding_x")
    private int borderPaddingX = 10;
    @SerializedName("border_padding_y")
    private int borderPaddingY = 10;

    @SerializedName("font_size")
    private double fontSize = 1;

    /**
     * Default layout
     */
    public WidgetLayout() {

    }

    /**
     * Create inventory layout.
     * This layout can transform the size, margin and padding of the Minecraft inventory slots
     *
     * @param slotWidth Slot width
     * @param slotHeight Slot height
     * @param slotMarginX Left and right space of the slots
     * @param slotMarginY Top and bottom space of the slots
     * @param borderPaddingX Left and right space between the slots and the background border
     * @param borderPaddingY Top and bottom space between the slots and the background border
     */
    public WidgetLayout(int slotWidth, int slotHeight, int slotMarginX, int slotMarginY, int borderPaddingX, int borderPaddingY) {
        this.slotWidth = slotWidth;
        this.slotHeight = slotHeight;
        this.slotMarginX = slotMarginX;
        this.slotMarginY = slotMarginY;
        this.borderPaddingX = borderPaddingX;
        this.borderPaddingY = borderPaddingY;
    }

    public int getSlotWidth() {
        return slotWidth;
    }

    public void setSlotWidth(int slotWidth) {
        this.slotWidth = slotWidth;
    }

    public int getSlotHeight() {
        return slotHeight;
    }

    public void setSlotHeight(int slotHeight) {
        this.slotHeight = slotHeight;
    }

    public int getSlotMarginX() {
        return slotMarginX;
    }

    public void setSlotMarginX(int slotMarginX) {
        this.slotMarginX = slotMarginX;
    }

    public int getSlotMarginY() {
        return slotMarginY;
    }

    public void setSlotMarginY(int slotMarginY) {
        this.slotMarginY = slotMarginY;
    }

    public int getBorderPaddingX() {
        return borderPaddingX;
    }

    public void setBorderPaddingX(int borderPaddingX) {
        this.borderPaddingX = borderPaddingX;
    }

    public int getBorderPaddingY() {
        return borderPaddingY;
    }

    public void setBorderPaddingY(int borderPaddingY) {
        this.borderPaddingY = borderPaddingY;
    }

    public double getFontSize() {
        return fontSize;
    }

    public void setFontSize(double fontSize) {
        this.fontSize = fontSize;
    }
}
