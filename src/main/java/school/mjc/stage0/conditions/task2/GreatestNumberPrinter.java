package school.mjc.stage0.conditions.task2;

public class GreatestNumberPrinter {
    public void printGreatest(int first, int second) {
        if (first > second) {
            System.out.println(first);
        } else if (second > first) {
            System.out.println(second);
        } else {
            System.out.println(first);
        }
    }

    public static void main(String[] args) {
        int first = 10;
        int second = 10;

        GreatestNumberPrinter printer = new GreatestNumberPrinter();
        printer.printGreatest(first, second);

    }
}



//Implement the program that will find the greatest number from two that are passed as parameters to the method and print the greatest.
// In case of equality print any of them.