package inheritance;

public class ManualTester extends Tester{

    private String businessKnowledge;

   public ManualTester
           (String name, String functional, int experience, int certification,String businessKnowledge)
   { super(name,functional,experience,certification);
   this.businessKnowledge=businessKnowledge;
       }

    public ManualTester()
    {}



    public void setBusinessKnowledge (String businessKnowledge)
    {this.businessKnowledge =businessKnowledge;}
    public String getBusinessKnowledge()
    {return businessKnowledge;}

    @Override
    public void testerGreeting()
    {System.out.println("Good morning! My name is " + name + ". I am " + getFunctional() + " manual tester. I have " +
            experience + " years experience and " + certification + " professional certifications. " +
            "\nI have professional skills in " + getBusinessKnowledge());}


}
