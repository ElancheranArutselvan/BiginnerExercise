public class Arraysloop {
    public static void main(String[] args) {
        String[] colours = {"Black", "Red", "Orange", "Blue"};
        for(int i = 0; i< colours.length; i++){
            System.out.println(colours[i]);
        }for(String i : colours){
            System.out.println(i);
        }
    }
}