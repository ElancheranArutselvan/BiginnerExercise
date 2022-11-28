package Seetha.Player;

import java.math.BigDecimal;

public class Players {
    private String name;
    private String sport;
    private int mvpRank;
    private double income;

    Players(String _name,String _sport,int _mvpRank,double _income) {
        this.name = _name;
        this.sport = _sport;
        this.mvpRank = _mvpRank;
        this.income = _income;
    }

    public String getName() {
            return name;
        }

        public void setName(String newName) {
            this.name = newName;
        }

        public String getSport() {
            return sport;
        }

        public void setSport(String newSport) {
            this.sport = sport;
        }
        public int getMvpRank() {
        return mvpRank;
        }

        public void setMvpRank(int newMvpRank) {
        this.mvpRank = newMvpRank ;
        }

        public double getIncome() {
            return income;
        }

        public void setIncome(double newIncome) {
            this.income =newIncome;
        }
    }

