package _01TemplateMethod;

public class SavingAccount extends Account {

    @Override
    protected void ActualJob() {
        System.out.println("Doing Job in SavingAccount");
    }
}
