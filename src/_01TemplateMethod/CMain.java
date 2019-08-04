package _01TemplateMethod;

public class CMain {

    public static void main(String[] args) {

        Account currentAccount=new CurrentAccount();
        Account savingAccount=new SavingAccount();

        currentAccount.DoJOb();
        savingAccount.DoJOb();
    }
}
