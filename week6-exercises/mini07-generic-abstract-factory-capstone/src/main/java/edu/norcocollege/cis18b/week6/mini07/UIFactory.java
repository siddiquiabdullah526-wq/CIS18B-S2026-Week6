package edu.norcocollege.cis18b.week6.mini07;

public interface UIFactory<B extends Button, D extends Dialog> {

    B createButton();

    D createDialog();
}
