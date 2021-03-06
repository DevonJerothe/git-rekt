package com.gitrekt.resort.model.entities;

import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Room {

    @Id
    private String roomNumber;

    @ManyToOne(cascade = CascadeType.ALL)
    private RoomCategory roomCategory;

    /**
     * DO NOT CALL THIS CONSTRUCTOR. IT EXISTS ONLY BECAUSE IT IS REQUIRED BY HIBERNATE.
     */
    Room() {
        // REQUIRED BY HIBERNATE
    }

    public Room(String roomNumber, RoomCategory roomCategory) {
        this.roomNumber = roomNumber;
        this.roomCategory = roomCategory;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public RoomCategory getRoomCategory() {
        return roomCategory;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.roomNumber);
        hash = 17 * hash + Objects.hashCode(this.roomCategory);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if(obj == null) {
            return false;
        }
        if(getClass() != obj.getClass()) {
            return false;
        }
        final Room other = (Room) obj;
        if(!Objects.equals(this.roomNumber, other.roomNumber)) {
            return false;
        }
        if(!Objects.equals(this.roomCategory, other.roomCategory)) {
            return false;
        }
        return true;
    }

}
