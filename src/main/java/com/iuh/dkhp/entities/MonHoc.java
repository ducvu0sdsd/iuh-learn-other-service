package com.iuh.dkhp.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "MonHoc")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MonHoc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int maMon;
    private String tenMon;
    private int soTinChi;
    private int soTietLyThuyet;
    private int soTietThucHanh;
}
