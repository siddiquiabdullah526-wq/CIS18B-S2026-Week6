package edu.norcocollege.cis18b.week6.mini07;

public final class ScreenRenderer {

    private ScreenRenderer() {
    }

    public static <B extends Button, D extends Dialog> String render(UIFactory<B, D> factory) {
        UIScreen<B, D> screen = buildScreen(factory);
        return screen.render();
    }

    // this is implementation of the extension challenge
    public static <B extends Button, D extends Dialog> UIScreen<B, D> buildScreen(UIFactory<B, D> factory) {
        return new UIScreen<>(factory.createButton(), factory.createDialog());
    }
}
