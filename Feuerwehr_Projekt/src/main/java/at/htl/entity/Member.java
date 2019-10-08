package at.htl.entity;

import java.time.LocalDate;

public class Member {

    protected Long id;


    protected String name; //Vor- und Zuname

    protected String rank;

    protected String mail;

    protected LocalDate involvedSince;

    //region Getter and Setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public LocalDate getInvolvedSince() {
        return involvedSince;
    }

    public void setInvolvedSince(LocalDate involvedSince) {
        this.involvedSince = involvedSince;
    }
    //endregion
}
