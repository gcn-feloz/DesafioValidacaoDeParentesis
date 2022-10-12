import java.util.*;

public class ValidParentheses {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String TT = "";
        while (!TT.equals(" ")) {
            TT = leitor.nextLine();
            boolean caracter = ehValido(TT);
            System.out.println(caracter);
        }

    }

    public static boolean ehValido(String s) {
        System.out.println("entramos aqui");
        System.out.println("Tamanho de i: " + s.length());
        for (int i = 0; i < s.length(); i++) {

            if (Character.toString(s.charAt(i)).equals("(")) {
                System.out.print(i + "-Comparando ( :");
                System.out.println(Character.toString(s.charAt(i)));
                i++;
                if (Character.toString(s.charAt(i)).equals(")")) {
                    System.out.print(i + "-Comparando ) :");
                    System.out.println(Character.toString(s.charAt(i)));
                    // i++;
                } else {
                    System.out.println(("deveria parar aqui"));
                    return false;
                }
            } else if (Character.toString(s.charAt(i)).equals("{")) {
                System.out.print(i + "-Comparando { :");
                System.out.println(Character.toString(s.charAt(i)));
                i++;
                if (Character.toString(s.charAt(i)).equals("}")) {
                    System.out.print(i + "-Comparando } :");
                    System.out.println(Character.toString(s.charAt(i)));
                    // i++;
                } else {
                    System.out.println(("deveria parar aqui"));
                    return false;
                }
            } else if (Character.toString(s.charAt(i)).equals("[")) {
                System.out.print(i + "-Comparando [ :");
                System.out.println(Character.toString(s.charAt(i)));
                i++;
                if (Character.toString(s.charAt(i)).equals("]")) {
                    System.out.print(i + "-Comparando ] :");
                    System.out.println(Character.toString(s.charAt(i)));
                    // i++;
                } else {
                    System.out.println(("deveria parar aqui"));
                    return false;
                }
            } else {
                return false;
            }
        }

        return true;
        // TODO: implemente a lógica de caracteres válidos e retorne se a string é
        // valida ou não.
    }

}