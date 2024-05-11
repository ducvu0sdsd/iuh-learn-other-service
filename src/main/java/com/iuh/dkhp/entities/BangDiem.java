package com.iuh.dkhp.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "BangDiem")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BangDiem {
    @Id
    @ManyToOne
    private SinhVien sinhVien;
    @Id
    @OneToOne
    private HocKy hocKy;
}
