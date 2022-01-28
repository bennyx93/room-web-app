package com.bennychan.roomwebapp.data;

import com.bennychan.roomwebapp.models.Staff;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffRepository extends JpaRepository<Staff, String> {
}
