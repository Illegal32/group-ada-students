package az.coders.ada_students.lessons.lesson_9.HackerRank;

import java.util.*;
import java.text.*;

public class HackerRankFormatter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat franceFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        NumberFormat traditionalChinese = NumberFormat.getCurrencyInstance(Locale.TRADITIONAL_CHINESE);
        NumberFormat korean = NumberFormat.getCurrencyInstance(Locale.KOREA);
        NumberFormat uk = NumberFormat.getCurrencyInstance(Locale.UK);
        String us = usFormat.format(payment);
        String india = indiaFormat.format(payment);
        String china = chinaFormat.format(payment);
        String france = franceFormat.format(payment);
        String traChinese = traditionalChinese.format(payment);
        String koreann = korean.format(payment);
        String united_Kingdom = uk.format(payment);
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
        System.out.println("Traditional Chinese: " + traChinese);
        System.out.println("Korean: " + koreann);
        System.out.println("United Kingdom: " + united_Kingdom);
    }
}

