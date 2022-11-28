package error;

import AccessClass.CProtectedpack;

public class CProtectedWorking extends CProtectedpack {
    protected String show1(String abc){
        return(new CProtectedWorkingAA()).show2(abc);
    }
    protected class CProtectedWorkingAA extends Sprinter{
        protected String show2(String def){
            return super.show(def);
        }
    }

    public static void main(String[] args) {
        String ghi = new CProtectedWorking().show1("It is working");
        System.out.println(ghi);

    }

}
