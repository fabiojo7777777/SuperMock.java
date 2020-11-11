package automatedexecution;

public class AutomatedExecution
{
    private int counter;

    public void add1(int value)
    {
        counter += value;
    }

    public void add2(int value)
    {
        counter += (value * 2);
    }

    public int getCounter()
    {
        return counter;
    }
}
