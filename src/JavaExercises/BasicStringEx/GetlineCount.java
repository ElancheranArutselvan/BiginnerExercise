package JavaExercises.BasicStringEx;

public class GetlineCount {
    public static void main(String[] args) {
        String hit ="\nxxxxxWrite code to convert a given number into words. \n"+
                "\nFor example, if “1234” is given as input, the output should be \n"+
                "\none thousand two hundred thirty-four\n";
        System.out.println("Line count is : "+NoOfLine(hit));
    }
    static int NoOfLine(String abc){
        return abc.split("[\n|\r]").length;
    }
}
