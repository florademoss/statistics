package com.example.statistics.user;

import jakarta.persistence.*;

@Entity
@Table(name = "score")
public class Score {
    @Id
    int id;
    @Column(name = "mathScore")
    int mathScore;

    @Column(name = "classid")
    int classid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMathScore() {
        return mathScore;
    }

    public void setMathScore(int mathScore) {
        this.mathScore = mathScore;
    }

    public int getClassid() {
        return classid;
    }

    public void setClassid(int classid) {
        this.classid = classid;
    }
}
