package edu.norcocollege.cis18b.week6.mini07;

public class UIScreen<B extends Button, D extends Dialog> {

    private final B button;
    private final D dialog;

    public UIScreen(B button, D dialog) {
        this.button = button;
        this.dialog = dialog;
    }

    public B getButton() {
        return button;
    }

    public D getDialog() {
        return dialog;
    }

    public String render() {
        return button.render() + " + " + dialog.render();
    }
}
