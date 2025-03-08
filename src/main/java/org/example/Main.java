package org.example;

public class Main {
    public static boolean isPalindrome(int sayi){
        sayi = Math.abs(sayi);
        char[] digits = String.valueOf(sayi).toCharArray();
        String reversedSayi ="";
        for(int i = digits.length-1; i>=0; i--){
            reversedSayi += digits[i];
        }

        return sayi == Integer.parseInt(reversedSayi);
    }
    public static boolean isPerfectNumber(int sayi){
        if(sayi<0){ return false; } else {
        int sum = 0;
        for(int i = 1; i<sayi; i++){
            if(sayi%i==0){
                sum+=i;
            }
        }
            return sum == sayi;
        }
    }
    public static String numberToWords(int sayi){
        if (sayi<0){
            return "Invalid Value";
        }
        String result = "";
        char[] digits = String.valueOf(sayi).toCharArray();
        for(int i = 0; i<digits.length; i++){
            switch(digits[i]){
                case '0': result += "Zero "; break;
                case '1': result += "One "; break;
                case '2': result += "Two "; break;
                case '3': result += "Three "; break;
                case '4': result += "Four "; break;
                case '5': result += "Five "; break;
                case '6': result += "Six "; break;
                case '7': result += "Seven "; break;
                case '8': result += "Eight "; break;
                case '9': result += "Nine "; break;
            }
        }
        return result.trim();
    }
}
