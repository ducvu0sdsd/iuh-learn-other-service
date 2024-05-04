package com.iuh.dkhp.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "ChuyenNganh")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ChuyenNganh {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int maChuyenNganh;

    @ManyToOne
    @JoinColumn(name =  "maKhoa")
    private Khoa khoa;
    private String tenChuyenNganh;
}
