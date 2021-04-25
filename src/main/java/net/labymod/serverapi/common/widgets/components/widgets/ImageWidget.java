package net.labymod.serverapi.common.widgets.components.widgets;


import com.google.gson.annotations.SerializedName;
import net.labymod.serverapi.common.widgets.components.ContainerWidget;
import net.labymod.serverapi.common.widgets.util.Anchor;

/**
 * Widget to render a custom image
 *
 * @author LabyStudio
 */
public class ImageWidget extends ContainerWidget {

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
     * Create a custom texture to render
     *
     * @param id      Unique id of the widget
     * @param anchor  Anchor point for orientation
     * @param offsetX X anchor offset in pixel
     * @param offsetY Y anchor offset in pixel
     * @param width   The width of the container in pixels
     * @param height  The height of the container in pixels
     * @param url     Remote url of the image to render
     */
    public ImageWidget(int id, Anchor anchor, double offsetX, double offsetY, int width, int height, String url) {
        super(id, anchor, offsetX, offsetY, width, height);
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
