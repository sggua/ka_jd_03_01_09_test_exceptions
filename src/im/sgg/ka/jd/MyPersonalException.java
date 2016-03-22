package im.sgg.ka.jd;

public class MyPersonalException extends RuntimeException{

    public static void main(String[] args) {
        byte b=5;
        System.out.println("Try / catch");
        while (b>-5) {
            tryCatch(b--);
        }
        System.out.println("Throw");
        while (b<5) {
            throwError(b++);
        }


    }

    static void tryCatch(byte b) {
        System.out.print("Start b="+b);
        try {
            System.out.print("\tTrying \"100/b\":"+ (100/b));

        }catch (RuntimeException e){
            System.out.print("\tThe \"b\" can't be "+b);
        }finally {
            System.out.println("\t<CR><LF>");
        }

    }
    static void throwError(byte b) throws ArithmeticException {
        System.out.print("Start b="+b);
        System.out.println("\tTrying \"100/b\":"+ (100/b));
    }
}
