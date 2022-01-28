package com.bennychan.roomwebapp.service;

import com.bennychan.roomwebapp.models.Position;
import com.bennychan.roomwebapp.models.Staff;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class StaffService {

    private static final List<Staff> staff = new ArrayList<>();
    static {
        staff.add(new Staff(UUID.randomUUID().toString(), "Benny", "Chan", Position.CONCIERGE));
        staff.add(new Staff(UUID.randomUUID().toString(), "John", "Doe", Position.MANAGER));
        staff.add(new Staff(UUID.randomUUID().toString(), "Jane", "Doe", Position.MANAGER));
        staff.add(new Staff(UUID.randomUUID().toString(), "Jack", "Doe", Position.WAITER));
        staff.add(new Staff(UUID.randomUUID().toString(), "Jill", "Doe", Position.WAITER));
    }

    public List<Staff> getAllStaff() {
        return staff;
    }
}
