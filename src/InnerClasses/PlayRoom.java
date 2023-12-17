package InnerClasses;

import java.util.ArrayList;
import java.util.List;

public class PlayRoom {
    public static void main(String[] args) {
        List<GameConsole.Game.GameDisk> diskList=new ArrayList<>();
        GameConsole.Game.GameDisk disk1= GameConsole.Game.getDisk("Зомби",Genre.ACTION," убивайте зомби ,чтоб выжить");
        GameConsole.Game.GameDisk disk2= GameConsole.Game.getDisk("Гонки",Genre.RACE," выиграй гонку на спортивной машине");
        GameConsole.Game.GameDisk disk3= GameConsole.Game.getDisk("Шахматы",Genre.SPORT," играте в шахматы с другом или с компьютером");
        GameConsole.Game.GameDisk disk4= GameConsole.Game.getDisk("Лабиринт",Genre.ACTION," пройдите лабиринт и получите приз");
        diskList.add(disk1);
        diskList.add(disk2);
        diskList.add(disk3);
        diskList.add(disk4);

        List<GameConsole.Game.VirtualGame> virtualList=new ArrayList<>();
        GameConsole.Game.VirtualGame game1= GameConsole.Game.getVirtualGame("Лабиринт",Genre.ACTION);
        game1.setRating(3);
        GameConsole.Game.VirtualGame game2= GameConsole.Game.getVirtualGame("Американские горки",Genre.ACTION);
        game1.setRating(5);
        GameConsole.Game.VirtualGame game3= GameConsole.Game.getVirtualGame("Горные лыжи",Genre.SPORT);
        game1.setRating(4);
        GameConsole.Game.VirtualGame game4= GameConsole.Game.getVirtualGame("Прыжок с парашютом",Genre.ACTION);
        game1.setRating(2);

        virtualList.add(game1);
        virtualList.add(game2);
        virtualList.add(game3);
        virtualList.add(game4);
    }
}
