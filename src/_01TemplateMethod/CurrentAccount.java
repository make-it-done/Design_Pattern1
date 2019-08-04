package _01TemplateMethod;

public class CurrentAccount extends Account {
    @Override
    protected void ActualJob() {
        System.out.println("Doing job in CurrentAccount");
    }
}
