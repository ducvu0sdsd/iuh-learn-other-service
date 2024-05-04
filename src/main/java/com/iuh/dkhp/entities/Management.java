package com.iuh.dkhp.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "Managements")
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class Management {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ma;
    private String hoTen;
    private Date ngaySinh;
    private String noiSinh;
    private boolean gioiTinh;
    private String username;
    private String password;
    private String email;
    private String diaChi;
    private String danToc;

    @Override
    public String toString() {
        return "Management{" +
                "ma=" + ma +
                ", hoTen='" + hoTen + '\'' +
                ", ngaySinh=" + ngaySinh +
                ", noiSinh='" + noiSinh + '\'' +
                ", gioiTinh=" + gioiTinh +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", danToc='" + danToc + '\'' +
                '}';
    }
}