import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hotel marriott = new Hotel(new Room[]
                {
                        new Room(2, true, false, false, false, 11),
                        new Room(2, true, true, false, false, 12),
                        new Room(3, true, true, true, false, 13),
                        new Room(3, true, true, true, true, 21),
                        new Room(4, true, true, false, false, 22),
                        new Room(2, false, false, false, false, 23),
                        new Room(2, false, true, false, false, 31),
                        new Room(1, false, true, true, true, 32),
                        new Room(1, true, true, true, true, 33),
                });
        while (true) {
            System.out.println("Введите команду");
            String command = scanner.nextLine();
            if (command.equals("eat")) {
                marriott.getFreeRoomsWithEat();
            } else if (command.equals("freeRooms")) {
                marriott.getFreeRooms();
            } else if (command.equals("wifi")){
                marriott.getFreeRoomsWithWifi();
            } else if (command.equals("toilet")){
                marriott.getFreeRoomsWithToilet();
            } else if (command.equals("shower")){
                marriott.getFreeRoomsWithShower();
            }else if(command.indexOf("place") == 0){
                int place = Integer.parseInt(String.valueOf(command.charAt(6)));
                marriott.getRoomsWithPlace(place);
            }
        }
    }
}
