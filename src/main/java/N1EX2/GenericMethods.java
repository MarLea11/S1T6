package N1EX2;

public class GenericMethods<T> {

    public <T, U, K> void argumentsPrinter(T parameter1, U parameter2, K parameter3) {
        System.out.println(parameter1);
        System.out.println(parameter2);
        System.out.println(parameter3);
    }

}
