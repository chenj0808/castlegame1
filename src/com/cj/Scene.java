package com.cj;

/**
 * @description:
 * @author:ASUS
 * @date: Created in 2020/6/14 21:50
 * @version: ${VERSION}
 * @modified By:
 */
public class Scene {
    RoomSet roomSet=new RoomSet();
    Person person=new Person();

    public void initScene () {
        initRooms();
        initPerson(roomSet.searchRoomById("1"));
    }
    private void initRooms () {
        Room outside=new Room("1", "院子");
        Room pub=new Room("2", "酒吧");
        Room lobby=new Room("3", "大堂");
        Room study=new Room("4", "书房");
        Room bedroom=new Room("5", "卧室");

        outside.addReachableRoom("2", pub);
        outside.addReachableRoom("3", lobby);
        outside.addReachableRoom("4", study);

        pub.addReachableRoom("1", outside);
        lobby.addReachableRoom("1", outside);
        study.addReachableRoom("1", outside);
        study.addReachableRoom("5", bedroom);
        bedroom.addReachableRoom("4", study);

        roomSet.addRoom(outside);
        roomSet.addRoom(pub);
        roomSet.addRoom(lobby);
        roomSet.addRoom(study);
        roomSet.addRoom(bedroom);
    }

    private void initPerson (Room room) {
        person.setId("20190001");
        person.setName("xiaowu");
        person.setCurrentRoom(room);
    }

    public RoomSet getRoomSet () {
        return roomSet;
    }

    public void setRoomSet (RoomSet roomSet) {
        this.roomSet=roomSet;
    }

    public Person getPerson () {
        return person;
    }

    public void setPerson (Person person) {
        this.person=person;
    }
}

