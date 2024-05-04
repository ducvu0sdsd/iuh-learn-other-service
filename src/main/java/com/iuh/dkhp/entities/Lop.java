package com.iuh.dkhp.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Lop")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Lop {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private int maLop;
    private String tenLop;
    private int siSo;
    @ManyToOne
    @JoinColumn(name = "maChuyenNganh")
    private ChuyenNganh chuyenNganh;
}
