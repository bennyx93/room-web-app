package com.bennychan.roomwebapp.data;

import com.bennychan.roomwebapp.models.Room;
import org.springframework.data.jpa.repository.JpaRepository;

// Used for database operations
public interface RoomRepository extends JpaRepository<Room, Long> {
}
