package com.bennychan.roomwebapp.service;

import com.bennychan.roomwebapp.data.RoomRepository;
import com.bennychan.roomwebapp.models.Room;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService {
    private final RoomRepository roomRepository;

    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    public List<Room> getAllRooms() { return roomRepository.findAll(); }
}
