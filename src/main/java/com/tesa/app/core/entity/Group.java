package com.tesa.app.core.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Set;

@Data
@Builder
@Entity
@Table(name = "groups")
@AllArgsConstructor
@RequiredArgsConstructor
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long groupId;

    @Column(nullable = false, unique = true)
    private String name;

    @ManyToMany(mappedBy = "groups")
    private Set<User> members;

}
