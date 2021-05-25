public class Classroom {

    public static void main(String[] args) {
        Wilder firstPerson = new Wilder("Jean-Claude", true);
        Wilder secondPerson = new Wilder("Henri", false);
        System.out.println(firstPerson.whoAmI());
        System.out.println(secondPerson.whoAmI());
    }

}
