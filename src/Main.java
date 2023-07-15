public class Main {
    public static void main(String[] args) {
        Person person = new Person("Kanybai", "Asanov");
        System.out.println(person);
        Programmer programmer = new Programmer("Kumarbek ", "Pragramis ", "Google ");
        System.out.println(programmer);
        System.out.println(programmer.getCompaniName());
        programmer.coding();
        Dancer dancer = new Dancer("Kumarbek ", "a dance ", "Иish shymkent ");
        System.out.println(dancer);
        System.out.println(dancer.getGroupName());
        dancer.dancing();
        Singer singer = new Singer("Kumarbek ", "git ", "gitara chertet ");
        System.out.println(singer);
        System.out.println(singer.getDangName());
        singer.singing();
        singer.plauGitar();
    }
}