package Aintroducao.DTopicosBasicosSobreJava;

public class Aula02FuncoesString {
    public static void main(String[] args) {
       /*
       formatar: toLowerCase(), toUpperCase(), trim()
       recortar: substring(inicio), substring(inicio, fim)
       substituir: Replace(char, char), Replace(string, string)
       buscar: IndexOf, LastIndexOf
       str.Split(" ")
        */
        String original = "abcde FGHIJ ABC abc DEFG     ";

        //formatar
        System.out.println("original: " + original);
        System.out.println("toLowerCase: " + original.toLowerCase());
        System.out.println("toUpperCase: " + original.toUpperCase());
        System.out.println("trim: " + original.trim());

        //recortar
        System.out.println("substring: " + original.substring(3));
        System.out.println("substring: " + original.substring(3, 5));

        //substituir
        System.out.println("replace: " + original.replace("a", "1"));

        //buscar
        System.out.println("IndexOf: " + original.indexOf("A"));
        System.out.println("IndexOf: " + original.lastIndexOf("A"));

        //split
        System.out.println("split: " + original.split(" ")[0]);


    }
}
