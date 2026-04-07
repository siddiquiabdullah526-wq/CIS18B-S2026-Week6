package edu.norcocollege.cis18b.week6.mini07;

public final class ScreenRenderer {

    private ScreenRenderer() {
    }

    public static <B extends Button, D extends Dialog> String render(UIFactory<B, D> factory) {
        B button = factory.createButton();
        D dialog = factory.createDialog();
        return button.render() + " + " + dialog.render();
    }
}
