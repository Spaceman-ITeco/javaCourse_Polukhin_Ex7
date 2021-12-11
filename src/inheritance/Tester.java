package inheritance;

public abstract class  Tester {
    public String name;
    private String functional;
    protected int experience;
    int certification;



    public void getGreeting() {
        System.out.println(greeting);
        return;
    }


    private static String greeting ="Hello! Here are our testers.";


    public String getFunctional() {
        return functional;
    }

    public void setFunctional(String functional) {
        this.functional = functional;
    }


    public Tester(String name, String functional, int experience, int certification) {
        this.name = name;
        this.functional = functional;
        this.experience = experience;
        this.certification = certification;
    }
    public Tester ()
    {}

    public void testerGreeting()
    {System.out.println("Hello! My name is " + name + ". I am " + getFunctional() + " tester. I have " +
            experience + " years experience and " + certification + " professional certifications.");}

}
