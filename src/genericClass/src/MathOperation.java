public class MathOperation <T extends Number> {

    //Create a generic class called "MathOperation" that can perform simple mathematical operations (addition, subtraction, multiplication, division) with any type of number (integers, decimals, etc.).
    // It should have methods for each operation and for setting the input numbers.
    // Test your class with different types of numbers.

    private T num1;
    private T num2;

    public void setNumbers (T num1 , T num2)
    {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double sum (T num1 , T num2) {
        return num1.doubleValue() + num2.doubleValue();
    }

    public double substraction (T num1, T num2)
    {
        return num1.doubleValue() + num2.doubleValue();
    }

    public double multi (T num1 , T num2)
    {
        return num1.doubleValue() * num2.doubleValue();
    }

    public double div (T num1, T num2)
    {
        return num1.doubleValue() / num2.doubleValue();
    }

}
