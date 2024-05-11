package com.iuh.dkhp.services;

import com.iuh.dkhp.entities.DangKyHocPhan;
import com.iuh.dkhp.repositories.DangKyHocPhanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class DangKyHocPhanService {

    @Autowired
    private DangKyHocPhanRepository dangKyHocPhanRepository;

    public ResponseEntity<?> getDangKyHocPhanTheoSinhVien (String mssv) {
        DangKyHocPhan dangKyHocPhan = dangKyHocPhanRepository.findDangKyHocPhanTheoMSSV(mssv);
        return ResponseEntity.status(HttpStatus.FOUND).body(dangKyHocPhan);
    }

}
