package net.labymod.serverapi.common.widgets.components.widgets;

import com.google.gson.annotations.SerializedName;
import net.labymod.serverapi.common.widgets.components.ContainerWidget;
import net.labymod.serverapi.common.widgets.util.Anchor;

/**
 * Widget to render an advanced inventory slot
 *
 * @author LabyStudio
 * @since 3.8.26
 */
public class InventorySlotWidget extends ContainerWidget {

    /**
     * Remote url of the image to render
     */
    private String url;

    /**
     * The left cut value of the image texture (Default 0)
     */
    @SerializedName("cut_x")
    private int cutX;

    /**
     * The top cut value of the image texture (Default 0)
     */
    @SerializedName("cut_y")
    private int cutY;

    /**
     * The right cut value of the image texture (Default 256)
     */
    @SerializedName("cut_width")
    private int cutWidth = 256;

    /**
     * The bottom cut value of the image texture (Default 256)
     */
    @SerializedName("cut_height")
    private int cutHeight = 256;

    /**
     * Create an inventory slot widget for a wrapped inventory
     *
     * @param slotIndex The inventory slot index. (This is also the unique id)
     * @param url       Remote url of the image to render
     */
    public InventorySlotWidget(int slotIndex, String url) {
        super(slotIndex, new Anchor(0, 0), 0, 0, 0, 0);
        this.url = url;
    }

    /**
     * Cut the image by the given amount on the left and top side
     *
     * @param x Amount of pixels to cut off on the left side
     * @param y Amount of pixels to cut off on the top side
     */
    public void setCutXY(int x, int y) {
        this.cutX = x;
        this.cutY = y;
    }

    /**
     * Cut the image by the given amount on the right and bottom side. 256 is the entire image. 256 / 2 would cut off the half of the image on the right
     * and bottom side.
     *
     * @param width  0 - 256 image cut scale on the right side
     * @param height 0 - 256 image cut scale on the bottom side
     */
    public void setCutWithHeight(int width, int height) {
        this.cutWidth = width;
        this.cutHeight = height;
    }

    public int getCutX() {
        return cutX;
    }

    public int getCutY() {
        return cutY;
    }

    public int getCutWidth() {
        return cutWidth;
    }

    public int getCutHeight() {
        return cutHeight;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
