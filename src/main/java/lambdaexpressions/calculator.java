package lambdaexpressions;

public interface calculator {
    int calculate(int a, int b);

    default void print() {
        System.out.println("hi");
    }

}
