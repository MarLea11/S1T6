package N1EX1;

public class App {

    private App(){}

    public static void runProgram() {

        NoGenericMethods ordered = new NoGenericMethods("Gabriel", "Perez", "Luis");
        NoGenericMethods notOrdered = new NoGenericMethods("Luis", "Gabriel", "Perez");

        System.out.println(ordered.toString());
        System.out.println(notOrdered.toString());

    }

}
