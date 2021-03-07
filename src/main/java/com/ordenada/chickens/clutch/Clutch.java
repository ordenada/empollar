package com.ordenada.chickens.clutch;

import com.ordenada.chickens.chicken.Chicken;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table
public class Clutch {

    @Id
    @SequenceGenerator(
            name = "clutch_sequence",
            sequenceName = "clutch_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "clutch_sequence"
    )

    private Long id;
    private Date startDate;
    private Date endDate;
    private Integer eggs;
    private String eggType;
    private Chicken chicken;

    public Clutch() {
    }

    public Clutch(Long id, Date startDate, Date endDate, Integer eggs, String eggType, Chicken chicken) {
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.eggs = eggs;
        this.eggType = eggType;
        this.chicken = chicken;
    }

    public Clutch(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Integer getEggs() {
        return eggs;
    }

    public void setEggs(Integer eggs) {
        this.eggs = eggs;
    }

    public String getEggType() {
        return eggType;
    }

    public void setEggType(String eggType) {
        this.eggType = eggType;
    }

    public Chicken getChicken() {
        return chicken;
    }

    public void setChicken(Chicken chicken) {
        this.chicken = chicken;
    }

    @Override
    public String toString() {
        return "Clutch{" +
                "id=" + id +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", eggs=" + eggs +
                ", eggType='" + eggType + '\'' +
                ", chicken=" + chicken +
                '}';
    }
}
