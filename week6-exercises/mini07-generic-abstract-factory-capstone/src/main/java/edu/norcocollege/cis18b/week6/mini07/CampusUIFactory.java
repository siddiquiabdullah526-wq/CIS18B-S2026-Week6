package edu.norcocollege.cis18b.week6.mini07;

public class CampusUIFactory implements UIFactory<CampusButton, CampusDialog> {

    @Override
    public CampusButton createButton() {
        return new CampusButton();
    }

    @Override
    public CampusDialog createDialog() {
        return new CampusDialog();
    }
}
