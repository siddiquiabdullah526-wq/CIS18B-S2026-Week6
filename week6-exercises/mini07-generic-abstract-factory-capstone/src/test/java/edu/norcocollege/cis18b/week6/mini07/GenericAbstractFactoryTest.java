package edu.norcocollege.cis18b.week6.mini07;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class GenericAbstractFactoryTest {

    @Test
    void rendersCampusFamily() {
        String rendered = ScreenRenderer.render(new CampusUIFactory());

        assertEquals("CampusButton + CampusDialog", rendered);
    }

    @Test
    void rendersMobileFamily() {
        String rendered = ScreenRenderer.render(new MobileUIFactory());

        assertEquals("MobileButton + MobileDialog", rendered);
    }

    @Test
    void factoryProducesExpectedConcreteTypes() {
        CampusUIFactory factory = new CampusUIFactory();

        assertTrue(factory.createButton() instanceof CampusButton);
        assertTrue(factory.createDialog() instanceof CampusDialog);
    }

    // Extension challenge test: verifies the typed builder creates a family-consistent UI screen
    @Test
    void buildScreenCreatesTypedCampusScreen() {
        UIScreen<CampusButton, CampusDialog> screen = ScreenRenderer.buildScreen(new CampusUIFactory());

        assertTrue(screen.getButton() instanceof CampusButton);
        assertTrue(screen.getDialog() instanceof CampusDialog);
        assertEquals("CampusButton + CampusDialog", screen.render());
    }
}
