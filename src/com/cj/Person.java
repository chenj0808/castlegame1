package com.cj;

/**
 * @description:
 * @author:ASUS
 * @date: Created in 2020/6/14 21:43
 * @version: ${VERSION}
 * @modified By:
 */
public class Person {
    private String id;
    private String name;
    private Room currentRoom;

    public void go (String targetRoomId) {

        Room room;
        room= currentRoom.searchReachableRoomById(targetRoomId,currentRoom.getReachableRooms());
        if (room != null) {
            this.currentRoom=room;
            Ui.displayReachableRooms(this);
        } else {
            Ui.printNoRoom();
        }
    }
    public Person () {
    }
    public Person (String id, String name, Room currentRoom) {
        this.id=id;
        this.name=name;
        this.currentRoom=currentRoom;
    }
    public String getId () {
        return id;
    }
    public void setId (String id) {
        this.id=id;
    }
    public String getName () {
        return name;
    }
    public void setName (String name) {
        this.name=name;
    }
    public Room getCurrentRoom () {
        return currentRoom;
    }
    public void setCurrentRoom (Room currentRoom) {
        this.currentRoom=currentRoom;
    }
}
