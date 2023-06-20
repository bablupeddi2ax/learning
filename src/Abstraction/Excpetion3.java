package Abstraction;
import java.util.Scanner;

public class Excpetion3 {

    public static void main(String[] args) {
        try {
            avg();
        } 
        catch (NumberFormatException n) {
            System.out.println("Number Format Exception");
        }catch (Negative n) {
            System.out.println("Do not enter negative numbers");
        }
//        } catch (OutOfRange o) {
//            System.out.println(o.getMessage());
//        }
    }

    public static void avg() throws Negative{
        int m1, m2, m3;
        Scanner sc = new Scanner(System.in);

        m1 = Integer.parseInt(sc.nextLine());
        m2 = Integer.parseInt(sc.nextLine());
        m3 = Integer.parseInt(sc.nextLine());
        
        if (!(verifyMarks(m1) && verifyMarks(m2) && verifyMarks(m3))) {
            throw new Negative("Do not enter negative numbers", 1);
        }
//        if (!(m1 >= 0 && m1 <= 100 && m2 >= 0 && m2 <= 100 && m3 >= 0 && m3 <= 100)) {
//            throw new OutOfRange("Enter marks between 0 and 100", 2);
//        }
    }

    public static boolean verifyMarks(int m) {
        return m >= 0 && m <= 100;
    }
}

class Negative extends Exception {
    int errorCode = 1;

    Negative(String message, int errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public int getErrorCode() {
        return errorCode;
    }
}

class OutOfRange extends Exception {
    int errorCode = 2;

    OutOfRange(String message, int errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public int getErrorCode() {
        return errorCode;
    }
}
