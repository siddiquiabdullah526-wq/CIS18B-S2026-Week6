package edu.norcocollege.cis18b.week6.mini06;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class AlertSubjectTest {

    @Test
    void notifiesAllSubscribersWithTypedPayload() {
        AlertSubject<SecurityAlert> subject = new AlertSubject<>();
        List<String> levels = new ArrayList<>();

        subject.subscribe(alert -> levels.add("A-" + alert.level()));
        subject.subscribe(alert -> levels.add("B-" + alert.level()));

        subject.notifyObservers(new SecurityAlert("HIGH", "login attempts"));

        assertEquals(List.of("A-HIGH", "B-HIGH"), levels);
    }

    @Test
    void unsubscribeStopsFurtherNotifications() {
        AlertSubject<SecurityAlert> subject = new AlertSubject<>();
        List<String> received = new ArrayList<>();

        Observer<SecurityAlert> temp = alert -> received.add(alert.message());
        subject.subscribe(temp);
        subject.notifyObservers(new SecurityAlert("MEDIUM", "first"));
        subject.unsubscribe(temp);
        subject.notifyObservers(new SecurityAlert("MEDIUM", "second"));

        assertEquals(List.of("first"), received);
    }
}
