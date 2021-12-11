package inheritance;

public class AutomationTester extends Tester{



    private String framework;

    public String getFramework() {
        return framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }

    public AutomationTester
            (String name, String functional, int experience, int certification,String framework)
    { super(name,functional,experience,certification);
        this.framework=framework;}

    public AutomationTester()
    {}
    @Override
    public void testerGreeting()
    {System.out.println("Hi! My name is " + name + ". I am " + getFunctional() + " automation tester. I have " +
            experience + " years experience and " + certification + " professional certifications. " +
            "I use for work " + getFramework());}

}
