package com.practice;

class Operator {

    public void arithmatic() {
        System.out.println("Arithmatic Operators");

        int a = 10;
        int b = 88;

        System.out.println("Addition " + (a + b));
        System.out.println("Sutraction " + (a - b));
        System.out.println("Multiplication " + (a * b));
        System.out.println("Division " + (a / b));
        System.out.println("Modulo " + (a % b));
    }

    public void assignment() {
        System.out.println("Assignment Operators");
        int a = 10;
        int b = 20;
        int c = 10;

        System.out.println("Addition Assignment");
        c += a;
        c = c + a;
        c += 100;
        System.out.println(" a " + a);
        System.out.println(" b " + b);
        System.out.println(" c " + c);

        System.out.println(" Subtraction Assignment");
        b -= a;
        b = b - a;
        b -= 10;
        System.out.println(" a " + a);
        System.out.println(" b " + b);
        System.out.println(" c " + c);

        System.out.println("Multiplication Assignment");
        c *= a;
        c = c * a;
        c *= 10;
        System.out.println(" a " + a);
        System.out.println(" b " + b);
        System.out.println(" c " + c);

        System.out.println(" Division Assignment");
        b /= a;
        b = b / a;
        b /= 2;
        System.out.println(" a " + a);
        System.out.println(" b " + b);
        System.out.println(" c " + c);

        System.out.println(" Modulo Assignment");
        c %= a;
        c = c % a;
        c %= 7;
        System.out.println("👉 a " + a);
        System.out.println("👉 b " + b);
        System.out.println("👉 c " + c);
    }

    public void comparision() {
        System.out.println("🔥 Comparision Operators 🔥");
        int a = 10;
        int b = 20;
        boolean c = true;
        boolean res = false;

        System.out.println("✅ Equality");
        System.out.println("👉 a = " + a);
        System.out.println("👉 b = " + b);
        System.out.println("👉 c = " + c);
        System.out.println("📌 (a == b) != c");
        res = (a == b) != c;
        System.out.println("👉 res = " + res);

        System.out.println("✅ InEquality");
        System.out.println("👉 a = " + a);
        System.out.println("👉 b = " + b);
        System.out.println("👉 c = " + c);
        System.out.println("📌 (a != (b+=10)) == c");
        res = (a != (b+=10)) == c;
        System.out.println("👉 res = " + res);

        System.out.println("✅ Less than and Greater Than");
        System.out.println("👉 a = " + a);
        System.out.println("👉 b = " + b);
        System.out.println("👉 c = " + c);
        System.out.println("📌 ((a > 67) == (b <= 45)) == !c");
        res = ((a > 67) == (b <= 45)) == !c;
        System.out.println("👉 res = " + res);
    }

    public void logical() {
        System.out.println("🔥 Logical Operators 🔥");
        int a = 10;
        int b = 20;
        boolean c = true;
        boolean res = false;

        System.out.println("✅ AND && ");
        System.out.println("👉 a = " + a);
        System.out.println("👉 b = " + b);
        System.out.println("👉 c = " + c);
        System.out.println("📌 ((a > 89) && (b < 90)) && c");
        res = ((a > 89) && (b < 90)) && c;
        System.out.println("👉 res = " + res);

        System.out.println("✅ OR || ");
        System.out.println("👉 a = " + a);
        System.out.println("👉 b = " + b);
        System.out.println("👉 c = " + c);
        System.out.println("📌 ((a > 89) || (b < 90))");
        res = ((a > 89) || (b < 90));
        System.out.println("👉 res = " + res);

        System.out.println("✅ NOT ! ");
        System.out.println("👉 a = " + a);
        System.out.println("👉 b = " + b);
        System.out.println("👉 c = " + c);
        System.out.println("📌 !(a == b)");
        res = !(a == b);
        System.out.println("👉 res = " + res);
    }
    
    public void bitWiseOp() {
    	int a=1;
    	int b=2;
    	
    	int res=a&b|a;
    	
    	System.out.println("Bitwise And : "+(a&b));
    	System.out.println("Bitwise OR : "+(a|b));
    	System.out.println("Bitwise XOR : "+(a^b));
    	
    	System.out.println(res);
    }
    public void unaryOperator() {
    	int a=12;
    	int b=5;
    	int res=a+++b--+--a+b+++--b+--a;
    	
    	System.out.println("A "+a);
    	System.out.println("B "+b);
    	
    	System.out.println("Res "+res);
    }
    public void ternary() {
        System.out.println("🔥 Ternary Operators 🔥");
        int a = 10;

        String num = (a>5) ? "Yes" : "No";
        System.out.println(num);
    }
}

public class Demo {
    public static void main(String[] args) {
        Operator op = new Operator();
//        op.logical();
        
//        op.bitWiseOp();
//        System.out.println(10>>>1);
        
        op.unaryOperator();
    }
}
