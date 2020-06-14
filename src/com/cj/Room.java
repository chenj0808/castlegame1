package com.cj;

import java.util.HashMap;

/**
 * @description:
 * @author:ASUS
 * @date: Created in 2020/6/14 21:44
 * @version: ${VERSION}
 * @modified By:
 */
public class Room {
    private String id;
    private String description;
    private HashMap<String, Room> reachableRooms=new HashMap<>();

    public void addReachableRoom(String roomId,Room room){
        reachableRooms.put(roomId,room);
    }

    public Room searchReachableRoomById (String targetRoomId, HashMap<String,Room> reachableRooms) {
        Room room=null;
        if(true == reachableRooms.containsKey(targetRoomId))
        {
            room=reachableRooms.get(targetRoomId);
        }
        return room;
    }

    @Override
    public String toString()
    {
        return this.description;
    }
    public Room () {
    }
    public Room (String id, String description) {
        this.id=id;
        this.description=description;
    }
    public String getId () {
        return id;
    }

    public void setId (String id) {
        this.id=id;
    }
    public String getDescription () {
        return description;
    }
    public void setDescription (String description) {
        this.description=description;
    }
    public HashMap<String, Room> getReachableRooms () {
        return reachableRooms;
    }
    public void setReachableRooms (HashMap<String, Room> reachableRooms) {
        this.reachableRooms=reachableRooms;
    }
}
