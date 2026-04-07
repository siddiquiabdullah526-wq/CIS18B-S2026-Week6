package edu.norcocollege.cis18b.week6.mini06;

public class GenericObserverDemo {

    public static void main(String[] args) {
        Subject<SecurityAlert> stream = new AlertSubject<>();

        stream.subscribe(alert -> System.out.println("Observer A received: " + alert.level()));
        stream.subscribe(alert -> System.out.println("Observer B received: " + alert.level()));

        SecurityAlert alert = new SecurityAlert("HIGH", "login attempts");
        System.out.println("Dispatching alert: " + alert.level() + " " + alert.message());
        stream.notifyObservers(alert);
    }
}
