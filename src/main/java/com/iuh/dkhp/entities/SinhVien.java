package com.iuh.dkhp.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "SinhVien")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SinhVien {
    @Id
    private String mssv;
    private String hoTen;
    private Date ngaySinh;
    private String noiSinh;
    // true la nam, false la nu
    private boolean gioiTinh;
    private String password;
    private String email;
    private String diaChi;
    private String danToc;
}
