package com.iuh.dkhp.controllers;

import com.iuh.dkhp.services.DangKyHocPhanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/dkhp")
public class DangKyHocPhanController {

    @Autowired
    private DangKyHocPhanService dangKyHocPhanService;

    @GetMapping("/{mssv}")
    public ResponseEntity<?> getDangKyHocPhanTheoMSSV (@PathVariable("mssv") String mssv) {
        return dangKyHocPhanService.getDangKyHocPhanTheoSinhVien(mssv);
    }
}
