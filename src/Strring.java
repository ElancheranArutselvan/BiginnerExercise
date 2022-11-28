public class Strring {
    public static void main(String[] args) {
        String alpha = "World is wondering me each and every moment";
        System.out.println(alpha);
        System.out.println("Alpha length is:" + alpha.length());
        System.out.println(alpha.toUpperCase());
        System.out.println(alpha.toLowerCase());
        System.out.println(alpha.indexOf("each"));
        String name1 = "Enjoy";
        String name2 = "Numbers";
        System.out.println(name1.concat(name2));
        String inp1 = "25";
        String inp2 = "36";
        System.out.println(inp1.concat(inp2));
        String txt = "string is case \"sensitive\"";
        System.out.println(txt);
        System.out.println(alpha.contains("moment"));
        System.out.println(alpha.contains("true"));
    }
}