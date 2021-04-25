package net.labymod.serverapi.common.widgets.util;

/**
 * Response sent by the client when closing or interacting with the screen.
 *
 * @author LabyStudio
 */
public enum EnumResponse {
    CLOSE, // Type id 0 - Sent when the player closes the GUI
    INTERACT // Type id 1 - Sent when the players interact with a widget
}
