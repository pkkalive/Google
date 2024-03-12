package Scaler.Intermediate.ModuleOne;

import java.util.Scanner;

class IsItPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(isPrime(sc.nextInt()));
        sc.close();
    }

    public static Boolean isPrime(int num){
        if(num == 2 || num == 3){
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0){
            return false;
        }
        for (int i = 5; i * i <= num; i = i + 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}