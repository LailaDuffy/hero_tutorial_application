public class Hero extends Person{

    private int heroID;
    private int deedTime;

    public Hero() {
    }

    public Hero(String name,String surname, String nickname, int heroID, int deedTime) {
        super.name = name;
        super.surname = surname;
        super.nickname = nickname;
        this.heroID = heroID;
        this.deedTime = deedTime;
    }

    public int calculatedLevel() {
        if (deedTime < 20) {
            return 1;
        } else if (deedTime >= 20 && deedTime < 40) {
            return 2;
        } else if (deedTime >= 40) {
            return 3;
        } else {
            return 0;
        }
    }

   public int getHeroID() {
        return heroID;
    }

    public void setHeroID(int heroID) {
        this.heroID = heroID;
    }

    public int getDeedTime() {
        return deedTime;
    }

    public void setDeedTime(int deedTime) {
        this.deedTime = deedTime;
    }

    @Override
    public String toString() {
        return "Hero {" +
                "name = '" + name + '\'' +
                ", surname = '" + surname + '\'' +
                ", nickname = '" + nickname + '\'' +
                ", heroID = " + heroID +
                ", deedTime = " + deedTime +
                '}';
    }

}



