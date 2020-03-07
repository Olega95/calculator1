package ru.oleg.javarush;

public class MetodCalc {
    public Object calc(double n1, String op, double n2) {
        Object res = 0;
        switch (op) {
            case "+":
                if ((n1 + n2) % 1 == 0)
                    res = (int) (n1 + n2);
                else
                    res = (double) (n1 + n2);
                break;
            case "-":
                if ((n1 - n2) % 1 == 0)
                    res = (int) (n1 - n2);
                else
                    res = (double) (n1 - n2);
                break;
            case "*":
                if ((n1 * n2) % 1 == 0)
                    res = (int) (n1 * n2);
                else
                    res = (double) (n1 * n2);
                break;
            case "/":
                if ((n1 / n2) % 1 == 0)
                    res = (int) (n1 / n2);
                else
                    res = (double) (n1 / n2);
                break;
            default:
                res = 0;
                break;
        }
        return res;
    }
}
