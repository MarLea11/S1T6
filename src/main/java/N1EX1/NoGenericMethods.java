package N1EX1;

public class NoGenericMethods {

    private String object1;
    private String object2;
    private String object3;

    public NoGenericMethods(String object1, String object2, String object3) {
        this.object1 = object1;
        this.object2 = object2;
        this.object3 = object3;

    }

    public String getObject1() {
        return object1;
    }

    public String getObject2() {
        return object2;
    }

    public String getObject3() {
        return object3;
    }

    public String toString() {
        return object1 + " " + object2 + " " + object3;
    }


}
