import java.util.ArrayList;

public class District {

    private String title;
    private String city;
    private int districtId;
    private ArrayList<Person> personInTheDistrict = new ArrayList<>();


    public District() {
    }

    public District(String title, String city, int districtId, ArrayList<Person> personInTheDistrict) {
        this.title = title;
        this.city = city;
        this.districtId = districtId;
        this.personInTheDistrict = personInTheDistrict;
    }

    public boolean addNewPerson(Person person) {
        return personInTheDistrict.add(person);
    }

    public Person removePerson(int index) {
        return personInTheDistrict.remove(index);
    }

    public float calculateAvgDeedTime() {
        float totalDeedTime = 0f;
        for (Person eachPerson : personInTheDistrict) {
            if (eachPerson instanceof Hero) {
                totalDeedTime = ((Hero) eachPerson).getDeedTime();
            }
        }

        int amountOfHeroes = 0;
        for (Person eachPerson : personInTheDistrict) {
            if (eachPerson instanceof Hero) {
                amountOfHeroes++;
            }
        }
        float averageDeedTime = totalDeedTime/ amountOfHeroes;

        return averageDeedTime;
    }

    public float calculateAvgLevelInDistrict() {
        float totalLevelOfDistrict = 0f;
        for (Person eachPerson : personInTheDistrict) {
            if (eachPerson instanceof Hero) {
                totalLevelOfDistrict += ((Hero) eachPerson).calculatedLevel();
            }
        }

        int amountOfHeroes = 0;
        for (Person eachPerson : personInTheDistrict) {
            if (eachPerson instanceof Hero) {
                amountOfHeroes ++;
            }
        }
        float averageLevelInDistrict = totalLevelOfDistrict/ amountOfHeroes;

        return averageLevelInDistrict;
    }

    public int amountOfPersonsInDistrict() {
        return personInTheDistrict.size();
    }

    public void infoAboutPersonsInDistrict() {
        for (Person eachPerson : personInTheDistrict) {
            System.out.println(((Hero) eachPerson).toString());
        }
    }

    @Override
    public String toString() {
        return "District {" +
                "title = '" + title + '\'' +
                ", city = '" + city + '\'' +
                ", districtId = " + districtId +
                ", personInTheDistrict = " + personInTheDistrict +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getDistrictId() {
        return districtId;
    }

    public void setDistrictId(int districtId) {
        this.districtId = districtId;
    }

    public ArrayList<Person> getPersonInTheDistrict() {
        return personInTheDistrict;
    }

    public void setPersonInTheDistrict(ArrayList<Person> personInTheDistrict) {
        this.personInTheDistrict = personInTheDistrict;
    }
}
