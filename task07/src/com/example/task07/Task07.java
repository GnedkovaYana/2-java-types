package com.example.task07;

public class Task07 {

    public static int solution(int n, int m, int k) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей
        int count1 = n/k;
        int count2 = m/k;
        return count1*count2;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int result = solution(20, 50, 3);
        System.out.println(result);

    }

}
