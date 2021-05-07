package net.labymod.serverapi.common.widgets;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializer;
import net.labymod.serverapi.common.widgets.components.Widget;
import net.labymod.serverapi.common.widgets.util.EnumScreenAction;
import net.labymod.serverapi.common.widgets.util.EnumWidget;

import java.util.ArrayList;
import java.util.List;

/**
 * Widget screen containing all widgets
 *
 * @author LabyStudio
 */
public class WidgetScreen {

    private static final Gson GSON = new GsonBuilder()
            .registerTypeAdapter(Widget.class, (JsonSerializer<Widget>) (src, typeOfSrc, context) -> {
                JsonObject object = new JsonObject();
                object.addProperty("type", EnumWidget.getTypeOf(src.getClass()).ordinal());
                object.add("attributes", context.serialize(src));
                return object;
            }).registerTypeAdapter(Widget.class, (JsonDeserializer<Widget>) (json, typeOfSrc, context) -> {
                JsonObject obj = json.getAsJsonObject();
                int id = obj.get("type").getAsInt();
                JsonObject attributes = obj.get("attributes").getAsJsonObject();
                return context.deserialize(attributes, EnumWidget.values()[id].getClazz());
            }).create();

    private final int id;
    private final List<Widget> widgets = new ArrayList<>();
    private WidgetLayout layout = null;

    /**
     * Create a widget screen with the given id.
     * The id is required to handle the interaction response
     *
     * @param id Unique screen id
     */
    public WidgetScreen(int id) {
        this.id = id;
    }

    /**
     * Change the layout of the wrapped inventory
     * Note: This is only available when using the screen action {@link EnumScreenAction#WRAP_INVENTORY}
     *
     * @param widgetLayout Screen layout
     */
    public void setLayout(WidgetLayout widgetLayout) {
        this.layout = widgetLayout;
    }

    /**
     * Add a widget to the scren
     *
     * @param widget The widget to add
     */
    public void addWidget(Widget widget) {
        this.widgets.add(widget);
    }

    /**
     * Get widget layout
     *
     * @return The widget layout
     */
    public WidgetLayout getLayout() {
        return layout;
    }

    /**
     * Convert widget screen to json object
     *
     * @param action Screen action
     * @return Serialized screen
     */
    public JsonObject toJsonObject(EnumScreenAction action) {
        JsonObject object = GSON.toJsonTree(this).getAsJsonObject();
        object.addProperty("action", action.ordinal());
        return object;
    }

    public List<Widget> getWidgets() {
        return widgets;
    }

    public int getId() {
        return id;
    }

    /**
     * Create widget screen instance from json object
     *
     * @param object Json object
     * @return Widget screen
     */
    public static WidgetScreen from(JsonObject object) {
        return GSON.fromJson(object, WidgetScreen.class);
    }
}
