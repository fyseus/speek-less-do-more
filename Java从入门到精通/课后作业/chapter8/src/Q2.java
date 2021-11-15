import java.lang.Character;
public class Q2 {
    public static void main(String[] args) {
        Character c1 = new Character('a');
        Character c2 = new Character('A');
        System.out.println(c1.equals(c2));
        System.out.println(Character.toLowerCase(c1) == Character.toLowerCase(c2));
    }
}
