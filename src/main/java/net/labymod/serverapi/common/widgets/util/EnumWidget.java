package net.labymod.serverapi.common.widgets.util;

import net.labymod.serverapi.common.widgets.components.Widget;
import net.labymod.serverapi.common.widgets.components.widgets.*;

/**
 * Enum with all widget components
 *
 * @author LabyStudio
 */
public enum EnumWidget {
    BUTTON(ButtonWidget.class),
    TEXT_FIELD(TextFieldWidget.class),
    LABEL(LabelWidget.class),
    COLOR_PICKER(ColorPickerWidget.class),
    IMAGE(ImageWidget.class),
    DROPDOWN(DropdownWidget.class);

    /**
     * The class of the widget
     */
    private final Class<? extends Widget> clazz;

    /**
     * Create a widget type
     *
     * @param clazz The class of the widget
     */
    EnumWidget(Class<? extends Widget> clazz) {
        this.clazz = clazz;
    }

    /**
     * Get widget class
     *
     * @return Widget class
     */
    public Class<? extends Widget> getClazz() {
        return this.clazz;
    }

    /**
     * Get widget type by widget class
     *
     * @param clazz The class of the widget
     * @return The type of the given class. (Can be null)
     */
    public static EnumWidget getTypeOf(Class<? extends Widget> clazz) {
        for (EnumWidget type : values()) {
            if (type.clazz == clazz) {
                return type;
            }
        }
        return null;
    }
}
