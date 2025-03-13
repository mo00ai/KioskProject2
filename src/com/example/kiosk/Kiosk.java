package com.example.kiosk;

import javax.swing.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    MenuItem menuItem;

    //프로그램 순서 및 흐름 제어를 담당하는 클래스
    private List<MenuItem> menuItems;

    public Kiosk(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }


    public void start() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔");
        System.out.println("🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔");
        System.out.println("🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔");
        System.out.println("🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔");
        System.out.println("🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔   햄버거 드실라우  🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔");
        System.out.println("🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔");
        System.out.println("🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔");
        System.out.println("🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔");
        System.out.println("🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔");


        boolean backButton = true;
        boolean exit = false;

        //메뉴 고르기
        while (!exit) {
            try {


                if (backButton) {

                    //메뉴들 출력
                    System.out.println("\n🍔 맘스터치 메뉴 🍔");

                    for (int i = 0; i < this.menuItems.size(); i++) {

                        String menuName = this.menuItems.get(i).getMenuName();
                        double menuPrice = this.menuItems.get(i).getMenuPrice();
                        String menuInfo = this.menuItems.get(i).getMenuInfo();

                        //영어는 한 글자당 1byte
                        //한글은 한 글자당 2byte

                        int menuSize = 20;
                        int length = menuSize - menuName.length();

                        System.out.printf("%-2d. %-" + length + "s | W %3.1f | %s%n", i + 1, menuName, menuPrice, menuInfo);

                    }

                    System.out.println("0 . 종료                |  종료");
                    System.out.println();

                }


                System.out.print("1~5 또는 0을 입력하세요: ");
                int num = scanner.nextInt();

                if (num == 1) {
                    System.out.println("\n-------- 선택한 메뉴 --------");
                    String menuName = this.menuItems.get(num - 1).getMenuName();
                    double menuPrice = this.menuItems.get(num - 1).getMenuPrice();
                    String menuInfo = this.menuItems.get(num - 1).getMenuInfo();

                    System.out.printf("%-2d. %-15s| W %5.1f | %s%n", num, menuName, menuPrice, menuInfo);

                    System.out.println("\n9. 이전으로");
                    System.out.println("0. 종료");

                    while (true) {
                        System.out.print("\n입력 : ");
                        num = scanner.nextInt();
                        if (num == 0) {
                            System.out.println("\n종료합니다.");
                            exit = true;
                            break;
                        } else if (num == 9) {
                            System.out.println("\n메뉴화면으로 돌아갑니다.\n");
                            backButton = true;
                            break;
                        } else {
                            System.out.println("\n0과 9 중에서만 입력해주세요\n");
                        }
                    }

                } else if (num == 2) {
                    System.out.println("\n-------- 선택한 메뉴 --------");
                    String menuName = this.menuItems.get(num - 1).getMenuName();
                    double menuPrice = this.menuItems.get(num - 1).getMenuPrice();
                    String menuInfo = this.menuItems.get(num - 1).getMenuInfo();

                    System.out.printf("%-2d. %-15s| W %5.1f | %s%n", num, menuName, menuPrice, menuInfo);

                    System.out.println("\n9. 이전으로");
                    System.out.println("0. 종료");



                    while (true) {
                        System.out.print("\n입력 : ");
                        num = scanner.nextInt();
                        if (num == 0) {
                            System.out.println("\n종료합니다.");
                            exit = true;
                            break;
                        } else if (num == 9) {
                            System.out.println("\n메뉴화면으로 돌아갑니다.\n");
                            backButton = true;
                            break;
                        } else {
                            System.out.println("\n0과 9 중에서만 입력해주세요\n");
                        }
                    }

                } else if (num == 3) {
                    System.out.println("\n-------- 선택한 메뉴 --------");
                    String menuName = this.menuItems.get(num - 1).getMenuName();
                    double menuPrice = this.menuItems.get(num - 1).getMenuPrice();
                    String menuInfo = this.menuItems.get(num - 1).getMenuInfo();

                    System.out.printf("%-2d. %-15s| W %5.1f | %s%n", num, menuName, menuPrice, menuInfo);

                    System.out.println("\n9. 이전으로");
                    System.out.println("0. 종료");

                    System.out.print("\n입력 : ");
                    num = scanner.nextInt();

                    while (true) {
                        System.out.print("\n입력 : ");
                        num = scanner.nextInt();
                        if (num == 0) {
                            System.out.println("\n종료합니다.");
                            exit = true;
                            break;
                        } else if (num == 9) {
                            System.out.println("\n메뉴화면으로 돌아갑니다.\n");
                            backButton = true;
                            break;
                        } else {
                            System.out.println("\n0과 9 중에서만 입력해주세요\n");
                        }
                    }

                } else if (num == 4) {
                    System.out.println("\n-------- 선택한 메뉴 --------");
                    String menuName = this.menuItems.get(num - 1).getMenuName();
                    double menuPrice = this.menuItems.get(num - 1).getMenuPrice();
                    String menuInfo = this.menuItems.get(num - 1).getMenuInfo();

                    System.out.printf("%-2d. %-15s| W %5.1f | %s%n", num, menuName, menuPrice, menuInfo);

                    System.out.println("\n9. 이전으로");
                    System.out.println("0. 종료");

                    System.out.print("\n입력 : ");
                    num = scanner.nextInt();

                    while (true) {
                        System.out.print("\n입력 : ");
                        num = scanner.nextInt();
                        if (num == 0) {
                            System.out.println("\n종료합니다.");
                            exit = true;
                            break;
                        } else if (num == 9) {
                            System.out.println("\n메뉴화면으로 돌아갑니다.\n");
                            backButton = true;
                            break;
                        } else {
                            System.out.println("\n0과 9 중에서만 입력해주세요\n");
                        }
                    }

                } else if (num == 5) {
                    System.out.println("\n-------- 선택한 메뉴 --------");
                    String menuName = this.menuItems.get(num - 1).getMenuName();
                    double menuPrice = this.menuItems.get(num - 1).getMenuPrice();
                    String menuInfo = this.menuItems.get(num - 1).getMenuInfo();

                    System.out.printf("%-2d. %-15s| W %5.1f | %s%n", num, menuName, menuPrice, menuInfo);

                    System.out.println("\n9. 이전으로");
                    System.out.println("0. 종료");

                    while (true) {
                        System.out.print("\n입력 : ");
                        num = scanner.nextInt();
                        if (num == 0) {
                            System.out.println("\n종료합니다.");
                            exit = true;
                            break;
                        } else if (num == 9) {
                            System.out.println("\n메뉴화면으로 돌아갑니다.\n");
                            backButton = true;
                            break;
                        } else {
                            System.out.println("\n0과 9 중에서만 입력해주세요\n");
                        }
                    }

                } else if (num == 0) {
                    System.out.println("키오스크를 종료합니다.");
                    exit= true;
                } else {
                    System.out.println("\n❌ 1~5 사이에서 다시 입력해주세요.\n");
                    backButton = false;
                }
            } catch (InputMismatchException e) {
                System.out.println("\n❌ 숫자만 입력해주세요\n");
                scanner.next();//버퍼비우기
            } catch (IllegalArgumentException e) {
                System.out.println("0과 9만 입력해주세요");
            }

        }
        scanner.close();
    }
}