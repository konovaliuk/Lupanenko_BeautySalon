package com.example.my_project2.entity;

import com.example.my_project2.entity.Services;
import com.example.my_project2.entity.Decords;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Table(name = "users", schema = "new_schema")
public class User implements Serializable{
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Integer id;
    private String name;
    private String surname;
    private String status;

    @OneToMany(mappedBy = "records")
    @JsonIgnore
    private List<Record> recordsList;

    @OneToMany(mappedBy = "services")
    @JsonIgnore
    private List<ServicesTable> servicesTable;

    public User(Integer id, String name, String surname, String status) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.status = status;
    }

    public User(String user_name, String surname, String status) {
        this.name = name;
        this.surname = surname;
        this.status = status;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + id +
                ", userName='" + name + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
