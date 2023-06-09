package com.devsuperior.dschallenge.entities;

import java.time.Instant;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_block")
public class Block {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant start_time;
    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant end_time;

    @ManyToOne
    @JoinColumn(name = "atividade_id")
    private Activity atividade;

    public Block() {

    }

    public Block(Integer id, Instant start, Instant end) {
        this.id = id;
        this.start_time = start;
        this.end_time = end;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Instant getStart() {
        return start_time;
    }

    public void setStart(Instant start) {
        this.start_time = start;
    }

    public Instant getEnd() {
        return end_time;
    }

    public void setEnd(Instant end) {
        this.end_time = end;
    }

}
