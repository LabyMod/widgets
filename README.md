## Widget model to create custom User Interfaces via plugin messages

Click [here](https://docs.labymod.net/pages/server/minecraft/screen/) for more detailed information.

### Available widgets:
- Button
- Text Field
- Label
- Color Picker
- Image

### Example
![example](.github/images/example.png)

### Serialize widgets
```java
// Create new screen
WidgetScreen screen = new WidgetScreen(42); // The client will send this id back on an interaction

// Centered anchor
Anchor anchor = new Anchor(50, 50); // X: 50%   Y: 50%
        
// Add button to widget list
screen.addWidget(new ButtonWidget(0, anchor, -50, 20, "Apply", 100, 20));

// Serialize widgets
JsonObject object = screen.toJsonObject(EnumScreenAction.OPEN); // OPEN = Open the screen
```

### Anchor explanation image
![example](.github/images/anchor.png)