package com.example.kiosk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Menu들 MenuItem에 등록
        MenuItem menuItem1 = new MenuItem("싸이버거", 4.9,"매콤한 통다리살 패티가 통째로~ 맘스터치 시그니처 버거");
        MenuItem menuItem2 =new MenuItem("불싸이버거", 5.1,"불 맛이 살아있는 싸이버거의 진또배기");
        MenuItem menuItem3 = new MenuItem("화이트갈릭버거", 4.9,"크림처럼 부드러운 화이트갈릭 소스에 통가슴살");
        MenuItem menuItem4 = new MenuItem("통새우버거", 4.9,"통새우살 패티에 신선한 양상추는 덤~");
        MenuItem menuItem5 = new MenuItem("딥치즈버거", 4.9,"부드러운 치즈와 한층 더 촉촉해진 닭가슴살");

        //MenuItem을 관리하는 List에 등록
        List<MenuItem> menuItems = new ArrayList<>(List.of(menuItem1,menuItem2,menuItem3,menuItem4,menuItem5));

        int index = 0;

        System.out.println("[ 맘스터치 메뉴 ]");
        for (MenuItem item : menuItems) {
            String menuName = item.getMenuName();
            double menuPrice = item.getMenuPrice();
            String menuInfo = item.getMenuInfo();

            int menuSize = 20;
            int length = menuSize - menuName.length();

            System.out.printf("%-2d. %-" + length + "s | W %3.1f | %s%n", ++index, menuName, menuPrice, menuInfo);
        }
        System.out.println("0 . 종료                |  종료");
        System.out.println();



        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("숫자를 입력하세요: ");
            int menuNum = scanner.nextInt();

            if(menuNum >= 1 && menuNum <= 5) {
                MenuItem item = menuItems.get(menuNum-1);
                int menuSize = 20;
                int length = menuSize - item.getMenuName().length();

                System.out.printf("%-2d. %-" + length + "s | W %3.1f | %s%n", menuNum, item.getMenuName(), item.getMenuPrice(), item.getMenuInfo());
                break;
            } else if (menuNum == 0) {
                System.out.println("프로그램을 종료합니다");
                break;
            } else {
                System.out.println("다시 입력하세요.");
            }
        }


    }

}
