package com.xcovery.listgames.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity // Indica que a classe vai mapear uma atabela no banco de dados
@Table(name = "tb_game") // Informando um nome para a tabela do banco de dados
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;

    //year é uma palavra reservada do sql, resolver renomeado com uma notação, customizando o nome da coluna
    @Column(name = "game_year")
    private int year;
    private String gere;
    private double score;
    private String imhUrl;
    private String shortDescription;
    private String longDescription;

    public Game(long id, String title, int year, String gere, double score, String imhUrl, String shortDescription, String longDescription) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.gere = gere;
        this.score = score;
        this.imhUrl = imhUrl;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return id == game.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    public Game () {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGere() {
        return gere;
    }

    public void setGere(String gere) {
        this.gere = gere;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getImhUrl() {
        return imhUrl;
    }

    public void setImhUrl(String imhUrl) {
        this.imhUrl = imhUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }
}
