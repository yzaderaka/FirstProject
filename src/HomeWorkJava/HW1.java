package HomeWorkJava;

public class HW1 {
    public static void main(String[] args) {
        double discount;
        char code = 'C';

        switch (code) {
            case 'A':
                discount = 0.0;

            case 'B':
                discount = 0.1;

            case 'C':
                discount = 0.2;

            default:
                discount = 0.3;
        }
    }

}