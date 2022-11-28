public class Oopsbasic {
    public static void main(String[] args) {
        System.out.println("Addition is " + add(15,16));
        System.out.println("Addition is " + addition(5.66f, 7.88f));
        fullName("Siva", "Tharun");
        Oopsbasic myObj = new Oopsbasic();
        myObj.wholeName("Senthil","Kumar");
    }static int add(int x, int y){

        return x+y;
}
    static float addition(float a,float b){
        return a+b;
    }static void fullName(String fname, String lname){
        System.out.println(fname + lname);
    }public void wholeName(String nameA, String nameB) {

        System.out.println(nameA + nameB);
    }

}