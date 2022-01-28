package com.bennychan.roomwebapp.controllers;

import com.bennychan.roomwebapp.service.StaffService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/staff")
public class StaffController {

    private final StaffService staffService;

    public StaffController(StaffService staffService) {
        this.staffService = staffService;
    }

    // Implement Controller
    @GetMapping
    public String getAllStaff(Model model) {
        // For attribute name, use the name from the template
        model.addAttribute("staffs", staffService.getAllStaff());
        // This is the view name we want to resolve to
        return "staff";
    }
}
