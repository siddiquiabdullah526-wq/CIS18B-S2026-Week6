package edu.norcocollege.cis18b.week6.mini07;

public class MobileUIFactory implements UIFactory<MobileButton, MobileDialog> {

    @Override
    public MobileButton createButton() {
        return new MobileButton();
    }

    @Override
    public MobileDialog createDialog() {
        return new MobileDialog();
    }
}
