package com.example.task10;

public class Task10 {

    public static boolean compare(float a, float b, int precision) {

        // TODO корректно сравнивать два значения типа float с заданной пользователем точностью (параметр - количество знаков после запятой).
        // Функция должна корректно обрабатывать ситуацию со сравнением значений бесконечности.
        // Функция должна считать значения «не число» NaN (например 0.0/0.0) равными между собой.

        if (Float.isNaN(a) || Float.isNaN(b)) {
            return Float.isNaN(a) && Float.isNaN(b);
        }
        else if (a > 0 && b > 0) {
                if (Float.isInfinite(a) && Float.isInfinite(b)) {
                    return true;
                }
                return Math.abs(a - b) < Math.pow(10, -precision);
            }
        else if (a >= 0 && b <= 0) {
            return false;
            }
        else
            return !(a <= 0) || !(b >= 0);
    }

    public static void main(String[] args) {
        float a = 0.3f;
        float b = 0.4f;
        float sum = a + b;
        float c = 0.7f;

        boolean result = compare(sum, c, 2);
        System.out.println(result);

    }

}
