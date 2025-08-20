package Ablazzing.Abstract.Practice.directory;

public class Country {
    private String language;
    private int people;
    private String continent;

    public Country(String language, int people, String continent) {
        this.language = language;
        this.people = people;
        this.continent = continent;
    }

    public String getLanguage() {
        return language;
    }

    public int getPeople() {
        return people;
    }

    public String getContinent() {
        return continent;
    }
}
