package GroupProject2;

public class Abracabra {
    public static void main(String[] args) {
        String word = "abracadabra";

        for (char chars : word.toCharArray()){
            if (word.indexOf(chars) == word.lastIndexOf(chars)){
                System.out.println("First non repeat character is "+ chars);
                break;
            }
        }
    }

}

