package com.example.my_project2.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Data
@Table(name = "records", schema = "new_schema")
@NoArgsConstructor
public class Records {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Integer id;
    private Timestamp date;
    private Integer id_service;
    private String type;

    @OneToMany(mappedBy = "records")
    @JsonIgnore
    private List<Records> Services;

    @ManyToOne
    @JoinColumn(name="id_user")
    private User user_record;

    public Records(Integer id, Timestamp date, Integer id_service, String type) {
    this.id = id;
    this.date = date;
    this.id_service = id_service;
    this.type = type;
    }

}
