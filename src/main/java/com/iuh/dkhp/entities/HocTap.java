package com.iuh.dkhp.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "HocTap")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class HocTap {
    @Id
    @OneToOne
    @JoinColumn(name = "mssv")
    private SinhVien sinhVien;
    @Id
    @OneToOne
    @JoinColumn(name = "maLop")
    private Lop lop;
}
