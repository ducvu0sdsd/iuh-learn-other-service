package com.iuh.dkhp.repositories;

import com.iuh.dkhp.entities.DangKyHocPhan;
import com.iuh.dkhp.entities.Management;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface DangKyHocPhanRepository extends JpaRepository<DangKyHocPhan, Integer> {

    @Query("select d from DangKyHocPhan d where d.sinhVien.mssv = :mssv")
    DangKyHocPhan findDangKyHocPhanTheoMSSV(@Param("mssv") String mssv);
}
