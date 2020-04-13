package com.example.my_project2.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table(name = "services", schema = "new_schema")
@NoArgsConstructor
public class Services {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Integer id;
    private Integer price;
    private string name;

    @ManyToOne
    @JoinColumns({
            @JoinColumn(name="master_id", referencedColumnName = "user_id"),
            @JoinColumn(name="manager_id", referencedColumnName = "user_id")
    })
    private User user_services;

    @ManyToOne
    @JoinColumn(name="id_client")
    private Services services;


}
