package Seetha.AccessModifier;

public class PrivateEx2 {
    private String nameA ;
    private String nameB ;
    private String sportA;
    private String sportB ;
    private int ageA ;
    private int ageB ;
    PrivateEx2(String _nameA,String _sportA,int _ageA){
        this.nameB = _nameA;
        this.sportB = _sportA;
        this.ageB = -_ageA;
    }
    public String getNameB() {
        return nameB;
    }

    public void setNameB(String newnameA) {
        this.nameB = newnameA;
    }

    public String getSportB() {
        return sportB;
    }

    public void setSportB(String newsportA) {
        this.sportB = newsportA;
    }

    public int getAgeA() {
        return ageB;
    }

    public void setAgeB(int newageA) {
        this.ageB = newageA;
    }
}
