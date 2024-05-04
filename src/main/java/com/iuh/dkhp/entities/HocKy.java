package com.iuh.dkhp.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "HocKy")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class HocKy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int maHocKy;
    private String tenHocKy;
    @ManyToOne
    @JoinColumn(name = "mssv")
    private SinhVien sinhVien;
}
