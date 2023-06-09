package com.devsuperior.dschallenge.entities;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "tb_activity")
public class Activity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @Column(columnDefinition = "TEXT")
    private String desc;
    private Double price;


    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Category categoria;




    @ManyToMany
    @JoinTable(name = "tb_activity_part",
            joinColumns = @JoinColumn(name = "activity_id"),
            inverseJoinColumns = @JoinColumn(name = "part_id"))
    private Set<Participant> participants = new HashSet<>();


    @OneToMany(mappedBy = "atividade")
    private List<Block> blocos = new ArrayList<>();


    public Activity() {

    }

    public Activity(Integer id, String name, String desc, Double price) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
