package edu.norcocollege.cis18b.week6.mini07;

public class GenericAbstractFactoryDemo {

    public static void main(String[] args) {
        String campusLine = ScreenRenderer.render(new CampusUIFactory());
        String mobileLine = ScreenRenderer.render(new MobileUIFactory());

        System.out.println("Campus UI: " + campusLine);
        System.out.println("Mobile UI: " + mobileLine);
    }
}
