package com.iuh.dkhp.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "GiaoVien")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GiaoVien {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private int maGiaoVien;
    private String hoTen;
    private Date ngaySinh;
    private String noiSinh;
    private boolean gioiTinh;
    private String email;
    private String diaChi;
    private String danToc;
    @ManyToOne
    @JoinColumn(name = "maKhoa")
    private Khoa khoa;
}
