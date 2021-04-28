package net.labymod.serverapi.common.widgets.util;

/**
 * Screen action sent by the server to tell the client what to do with the provided widgets.
 *
 * @author LabyStudio
 */
public enum EnumScreenAction {
    OPEN, // Action id 0 - Open a new screen
    UPDATE, // Action id 1 - Update the current screen
    CLOSE, // Action id 2 - Force close the current screen and display the previous screen of the user
    WRAP_INVENTORY // Action id 3 - Wrap a Minecraft Inventory
}
