public class Villain extends Person{

    private int villainID;
    private int crimeTime;

    public Villain() {
    }

    public Villain(String name, String surname, String nickname, int villainID, int crimeTime) {
        super.name = name;
        super.surname = surname;
        super.nickname = nickname;
        this.villainID = villainID;
        this.crimeTime = crimeTime;
    }

    @Override
    public Villain clone() throws CloneNotSupportedException {
        return (Villain) super.clone();
    }

    public int getVillainID() {
        return villainID;
    }

    public void setVillainID(int villainID) {
        this.villainID = villainID;
    }

    public int getCrimeTime() {
        return crimeTime;
    }

    public void setCrimeTime(int crimeTime) {
        this.crimeTime = crimeTime;
    }

    @Override
    public String toString() {
        return "Villain {" +
                "name = '" + name + '\'' +
                ", surname = '" + surname + '\'' +
                ", nickname = '" + nickname + '\'' +
                ", villainID = " + villainID +
                ", crimeTime = " + crimeTime +
                '}';
    }
}
