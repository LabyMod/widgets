package net.labymod.serverapi.common.widgets;

import com.google.gson.annotations.SerializedName;

/**
 * Widget layout used for the wrapped inventory
 *
 * @author LabyStudio
 */
public class WidgetLayout {

    @SerializedName("slot_width")
    private int slotWidth;
    @SerializedName("slot_height")
    private int slotHeight;

    @SerializedName("slot_margin_x")
    private int slotMarginX;
    @SerializedName("slot_margin_y")
    private int slotMarginY;

    @SerializedName("border_padding_x")
    private int borderPaddingX;
    @SerializedName("border_padding_y")
    private int borderPaddingY;

    /**
     *
     */
    public WidgetLayout() {

    }

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
}
