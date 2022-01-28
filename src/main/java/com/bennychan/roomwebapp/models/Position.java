package com.bennychan.roomwebapp.models;

public enum Position {
    CONCIERGE, MANAGER, WAITER, SECURITY, HOUSEKEEPING, FRONT_DESK;

    public String toString() {
        switch (this) {
            case CONCIERGE:
                return "Concierge";
            case MANAGER:
                return "Manager";
            case WAITER:
                return "Waiter";
            case HOUSEKEEPING:
                return "Housekeeping";
            case SECURITY:
                return "Security";
            case FRONT_DESK:
                return "Front Desk";
        }
        return "";
    }
}
