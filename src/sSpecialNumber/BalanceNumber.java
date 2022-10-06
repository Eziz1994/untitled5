package sSpecialNumber;

public class BalanceNumber {
    public static void main(String[] args) {
//Вывести первые 10 4-значных сбалансированных чисел.
        int a=123;
        String s=Integer.toString(a);
        int l = s.length();
        int left=0, right=0;
        for (int i=0; i<l/2; i++) {
          Character c=s.charAt(i);
          int d= Integer.parseInt(c.toString());
            left+=d;

        }
       int e=l%2==1?1:0;
        for (int i=0; i<l/2+e; i++) {
            Character c=s.charAt(i);
            int d= Integer.parseInt(c.toString());
            right+=d;

            boolean b= left==right;
            System.out.println(b);

    }
}}
