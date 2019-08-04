package _01TemplateMethod;

public abstract class Account {

    DB db=new DB();
    protected abstract void ActualJob();
    public void DoJOb()
    {
        this.db.openDB();
        this.ActualJob();
        this.db.closeDB();
    }


}
