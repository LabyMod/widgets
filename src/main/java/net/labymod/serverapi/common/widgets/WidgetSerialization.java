package net.labymod.serverapi.common.widgets;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import net.labymod.serverapi.common.widgets.components.Widget;

import java.util.List;

/**
 * Widget serialization utils. Used to convert the widget model to json and back.
 *
 * @author LabyStudio
 */
public class WidgetSerialization {

    private static final Gson GSON = new Gson();

    /**
     * Create a widget from a json object
     *
     * @param object The json serialized widget
     * @return Widget instance
     */
    public static Widget createWidget(JsonObject object) {
        int id = object.get("id").getAsInt();
        JsonObject attributes = object.get("attributes").getAsJsonObject();
        return GSON.fromJson(attributes, EnumWidget.values()[id].getClazz());
    }

    /**
     * Serialize a widget model list to a json array
     *
     * @param widgets Widget model list
     * @return Serialized widget model list as json array
     */
    public static JsonArray toJsonArray(List<Widget> widgets) {
        JsonArray widgetArray = new JsonArray();
        for (Widget widget : widgets) {
            widgetArray.add(toJsonObject(widget));
        }
        return widgetArray;
    }

    /**
     * @param widget
     * @return
     */
    public static JsonObject toJsonObject(Widget widget) {
        EnumWidget type = EnumWidget.getTypeOf(widget.getClass());
        if (type == null) {
            return null;
        }

        // Get id
        int id = type.ordinal();

        // Convert to json object
        JsonObject attributes = GSON.toJsonTree(widget).getAsJsonObject();

        // Create object
        JsonObject object = new JsonObject();
        object.addProperty("id", id);
        object.add("attributes", attributes);
        return object;
    }
}
