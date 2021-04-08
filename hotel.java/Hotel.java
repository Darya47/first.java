public class Hotel {
    Room [] freeRooms;
    int [] usedRooms;
    Hotel (Room[] rooms){
        this.freeRooms = rooms;
        this.usedRooms = new int[rooms.length];
    }
    void getFreeRooms(){
        Room[] rooms = this.freeRooms;
        System.out.println("Список свободных комнат--");
        for (int i = 0; i < freeRooms.length; i++) {
            if(rooms[i].roomNumber==0) {
                continue;
            }
            System.out.println("Комната N"+ rooms[i].roomNumber);
        }
        System.out.println("--Конец списка--");
    }
    void getUsedRooms(){
        int[] rooms = this.usedRooms;
        System.out.println("Список занетых комнат--");
        for (int i = 0; i < usedRooms.length; i++) {
            if (rooms[i]==0){
                continue;
            }
            System.out.println("Комната N"+ rooms[i]);
        }
        System.out.println("--Конец списка--");
    }
    void reservedRoom(int needRoom){
        Room[] freeRooms = this.freeRooms;
        for (int i = 0; i < freeRooms.length; i++) {
            if(needRoom == freeRooms[i].roomNumber){
                freeRooms[i].roomNumber = 0;
                this.usedRooms[i] = needRoom;
                System.out.println("Комната номер "+needRoom+" свободна");
                break;
            }else if(i+1==freeRooms.length);{
                System.out.println("Такой коматы не найдено");
            }
        }
    }
    void getRoomsWithPlace(int place){
        Room[]rooms = this.freeRooms;
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].place == place && rooms[i].roomNumber != 0) {
                System.out.println("Комната номер "+rooms[i].roomNumber+" имеет "+place+" спальных мест");
            }
        }
    }
    void getFreeRoomsWithEat(){
        Room[] rooms = this.freeRooms;
        for (int i = 0; i < rooms.length; i++) {
            if(rooms[i].eat && rooms[i].roomNumber != 0){
                System.out.println("Комната с едой "+rooms[i].roomNumber);
            }
        }
    }
    void getFreeRoomsWithWifi(){
        Room[]rooms = this.freeRooms;
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].wifi && rooms[i].roomNumber != 0){
                System.out.println("Комната с WiFi "+ rooms[i].roomNumber);
            }
        }
    }
    void getFreeRoomsWithToilet(){
        Room[]rooms = this.freeRooms;
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].toilet && rooms[i].roomNumber != 0){
                System.out.println("Комната с туалетом "+rooms[i].roomNumber);
            }
        }
    }
    void getFreeRoomsWithShower(){
        Room[]rooms = this.freeRooms;
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].shower && rooms[1].roomNumber != 0){
                System.out.println("Контана с душем "+rooms[i].roomNumber);
            }
        }
    }
}
