package com.example.statistics.user;

import jakarta.persistence.*;

@Entity
@Table(name = "score")
public class Score {
    @Id
    int id;
    @Column(name = "score")
    int score;
    @Column(name = "classid")
    int classid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getClassid() {
        return classid;
    }

    public void setClassid(int classid) {
        this.classid = classid;
    }
}
