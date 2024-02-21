package N1EX2;

public class App {

    private App(){}

    public static void runProgram() {

        GenericMethods generics = new GenericMethods();
        Person person1 = new Person("Eduardo", "Gonzalez", 25);

        generics.<String, Person, Integer>argumentsPrinter("Hello ", person1, 22);

    }

}
