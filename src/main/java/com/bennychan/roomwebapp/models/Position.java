package com.bennychan.roomwebapp.models;

public enum Position {
    CONCIERGE, MANAGER, WAITER;

    public String toString() {
        switch (this) {
            case CONCIERGE:
                return "Concierge";
            case MANAGER:
                return "Manager";
            case WAITER:
                return "Waiter";
        }
        return "";
    }
}
