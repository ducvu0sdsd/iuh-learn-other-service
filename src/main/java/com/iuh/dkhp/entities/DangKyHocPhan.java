package com.iuh.dkhp.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "DangKyHocPhan")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class DangKyHocPhan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name = "mssv")
    private SinhVien sinhVien;
    @ManyToOne
    @JoinColumn(name = "maHocPhan")
    private HocPhan hocPhan;
    private String nhomLyThuyet;
    private String nhomThucHanh;
}
