package onlineSkype;

public class Cinema {
    private String city;
    private Film[] cinemaFilms = new Film[10];
    private double cinemaPriceIndex;

    public Cinema(String city, double cinemaPriceIndex) {
        init();


        this.city = city;
        this.cinemaPriceIndex = cinemaPriceIndex;
    }

    private void init() {
        Film film1 = new Film("Animals", 50, 120, 0);
        cinemaFilms[0] = film1;
        Film film2 = new Film("Boys", 150, 20, 10);
        cinemaFilms[1] = film2;
        Film film3 = new Film("Ben gur", 150, 70, 80);
        cinemaFilms[2] = film3;

    }

    public String getCity() {
        return city;
    }

    public Film[] getCinemaFilms() {
        return cinemaFilms;
    }

    public double getCinemaPriceIndex() {
        return cinemaPriceIndex;
    }
}
