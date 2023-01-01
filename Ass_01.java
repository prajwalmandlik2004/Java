// import java.util.Scanner;

// User defined class 
class complexNumber {
    double real, img;

    // Constructor to accept the real and imaginary part
    complexNumber(double real, double img) {
        this.real = real;
        this.img = img;
    }
}

// Main Class
public class Ass_01 {

    public static complexNumber sum(complexNumber C1, complexNumber C2) {
        complexNumber temp = new complexNumber(0, 0);
        temp.real = C1.real + C2.real;
        temp.img = C1.img + C2.img;
        return temp;
    }

    public static complexNumber sub(complexNumber C1, complexNumber C2) {
        complexNumber temp1 = new complexNumber(0, 0);
        temp1.real = C1.real - C2.real;
        temp1.img = C1.img - C2.img;
        return temp1;
    }

    public static complexNumber mul(complexNumber C1, complexNumber C2) {
        complexNumber temp2 = new complexNumber(0, 0);
        temp2.real = C1.real * C2.real - C1.img * C2.img;
        temp2.img = C1.real * C2.img + C1.img * C2.real;
        return temp2;
    }

    public static complexNumber div(complexNumber C1, complexNumber C2) {
        complexNumber temp3 = new complexNumber(0, 0);
        temp3.real = ((C1.real * C2.real) + (C1.img * C2.img)) / (C2.real * C2.real + C2.img * C2.img);
        temp3.img = ((C1.img * C2.real) - (C1.real * C2.img)) / (C2.real * C2.real + C2.img * C2.img);
        return temp3;
    }

    // Main Function
    public static void main(String[] args) {
        complexNumber C1 = new complexNumber(5, 6);
        complexNumber C2 = new complexNumber(7, 8);
        complexNumber temp = sum(C1, C2);
        complexNumber temp1 = sub(C1, C2);
        complexNumber temp2 = mul(C1, C2);
        complexNumber temp3 = div(C1, C2);


        System.out.println("Sum of two complex number is :" + temp.real + "+" + temp.img + "i");
        System.out.println("Substraction of two complex number is :" + temp1.real + "+" + temp1.img + "i");
        System.out.println("Multiplication of two complex number is :" + temp2.real + "+" + temp2.img + "i");
        System.out.println("Division of two complex number is :" + temp3.real + "+" + temp3.img + "i");
    }
}
