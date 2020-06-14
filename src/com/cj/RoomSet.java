package com.cj;

import java.util.ArrayList;

/**
 * @description:
 * @author:ASUS
 * @date: Created in 2020/6/14 21:49
 * @version: ${VERSION}
 * @modified By:
 */
public class RoomSet {

    ArrayList<Room> rooms=new ArrayList<>();

    public void addRoom (Room room) {
        rooms.add(room);
    }

    public Room searchRoomById (String roomId) {
        Room room=null;
        for (Room item : rooms
        ) {
            if (item.getId().equals(roomId)) {
                room=item;
                break;
            }
        }
        return room;
    }

}
