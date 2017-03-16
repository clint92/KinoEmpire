package model;

/**
 * Created by Ali on 14-03-2017.
 */
public class Movie {
    String genre = "";
    String name = "";
    int age;
    int id;
    int dato;
    int length;

    public Movie(String genre, String name, int age, int id, int dato, int length) {
        this.genre = genre;
        this.name = name;
        this.age = age;
        this.id = id;
        this.dato = dato;
        this.length = length;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "movieClass{" +
                "genre='" + genre + '\'' + ", name='" + name + '\'' + ", age=" + age + ", id=" + id + ", dato=" + dato + ", length=" + length +
                '}';
    }
}