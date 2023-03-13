class Person {
    static void people(String name, int age, boolean married) {
        System.out.println(name);
        System.out.println(age);
        System.out.println(married);
    }
    public static void main(String[] args) {
        people("Andrei", 42, true);
        people("Ana", 25, false);
        people("Denis", 18, false);
    }
}