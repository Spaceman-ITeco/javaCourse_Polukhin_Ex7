package inheritance;

import static inheritance.ManualTester.*;

public class Main {
    public static void main(String[] args) {
        Tester tester = new ManualTester("Andrey","integration",
                4,2,"mobile phones");
        AutomationTester automationTester = new AutomationTester("Irina","frontend",2,
                1,"Selenium");
        tester.getGreeting();
        tester.testerGreeting();
        automationTester.testerGreeting();
        }

    }

