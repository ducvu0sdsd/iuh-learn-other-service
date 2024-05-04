package com.iuh.dkhp.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "HocPhan")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class HocPhan {
    @Id
    private String mahocPhan;
    @OneToOne
    @JoinColumn(name = "maMonHoc")
    private MonHoc monHoc;
    @OneToOne
    @JoinColumn(name = "maGiaoVien")
    private GiaoVien giaoVien;
    @OneToOne
    @JoinColumn(name = "maLop")
    private Lop lop;

}
