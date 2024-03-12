package Scaler.Intermediate.ModuleOne;

import java.util.Scanner;

class IsItPerfect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(isPerfect(sc.nextInt()));
        sc.close();
    }

    public static Boolean isPerfect(int num){
        int sum = 1;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                if (i * i == num) {
                    sum += i;
                } else {
                    sum += (i + num /i);
                }
            }
        }
        return sum == num;
    }
}
