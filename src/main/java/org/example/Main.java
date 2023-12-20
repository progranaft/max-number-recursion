package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(maxNumber(81110115));
    }
    public static int maxNumber(int x) {
        int max = x % 10;
        int tmp;
        if (x == 0) {
            return 0;
        } else {
            x /= 10;
            tmp = maxNumber(x);
        }
        if (max < tmp) {
            max = tmp;
        }
        return max;
    }
}