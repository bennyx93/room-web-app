package com.bennychan.roomwebapp.service;

import com.bennychan.roomwebapp.data.StaffRepository;
import com.bennychan.roomwebapp.models.Staff;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffService {
    private final StaffRepository staffRepository;

    public StaffService(StaffRepository staffRepository) {
        this.staffRepository = staffRepository;
    }

    public List<Staff> getAllStaff() {
        return staffRepository.findAll();
    }
}
