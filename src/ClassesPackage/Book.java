package ClassesPackage;

import java.time.Year;

public class Book {
    private String name = "";
    private String autor = "";
    private int year =0;
    private String production = "";
    private String genre = "";
    private int pictures = 0;

    public Book(String name, String autor, int year, String production, String genre, int pictures) {
        this.name = name;
        this.autor = autor;
        if(year > 0 && year <= Year.now().getValue()) {
            this.year = year;
        } else{
            this.year = 0;
        }
        this.production = production;
        this.genre = genre;
        if(pictures > 0) {
            this.pictures = pictures;
        } else{
            this.pictures = 0;
        }
    }

    public Book() {
    }

    public String getName() {
        return name;
    }

    public String getAutor() {
        return autor;
    }

    public int getYear() {
        return year;
    }

    public String getProduction() {
        return production;
    }

    public String getGenre() {
        return genre;
    }

    public int getPictures() {
        return pictures;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setYear(int year) {
        if(year > 0 && year <= Year.now().getValue()) {
            this.year = year;
        } else{
            this.year = 0;
        }
    }

    public void setProduction(String production) {
        this.production = production;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setPictures(int pictures) {
        if(pictures > 0) {
            this.pictures = pictures;
        } else{
            this.pictures = 0;
        }
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", autor='" + autor + '\'' +
                ", year=" + year +
                ", production='" + production + '\'' +
                ", genre='" + genre + '\'' +
                ", pictures=" + pictures +
                '}';
    }
    public void print(){
        String outStr="";
        if( !getName().isEmpty()) {
            outStr += "название книги: " + getName() + "\n";
        }
        if( !getAutor().isEmpty()) {
            outStr += "автор: " + getAutor() + "\n";
        }
        if( !getProduction().isEmpty()) {
            outStr += "издательство: " + getProduction() + "\n";
        }
        if( !getGenre().isEmpty()) {
            outStr += "жанр: " + getGenre() + "\n";
        }
        if( getYear() != 0) {
            outStr += "год выхода: " + getYear() + "\n";
        }
        if( getPictures() != 0) {
            outStr += "количество страниц: " + getPictures() + "\n";
        }

        System.out.println(outStr);
    }
}
