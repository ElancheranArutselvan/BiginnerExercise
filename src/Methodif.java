public  class Methodif {
    static void markS(int score){
        if(score>50){
            System.out.println(" You are Qualified");
        }else{
            System.out.println("  You are disqualified");
        }
    }

    public static void main(String[] args) {
        markS(55);
    }
}