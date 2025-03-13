package com.example.kiosk;

import javax.swing.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Kiosk {

    // 메뉴 리스트
    private List<Menu> menus;

    //메뉴 리스트의 게터 세터
    public List<Menu> getMenus() {
        return menus;
    }
    public void setMenus(List<Menu> menus) {
        this.menus = menus;
    }


    //키오스크 시작하는 메서드
    public void start() {
        Scanner scanner = new Scanner(System.in);

        //키오스크 인트로 출력문
        printBurgerMain();


        //필요한 변수들 전역변수로 선언 및 초기화
        boolean isKioskOff = false;
        boolean isCartEmpty = true;
        int mainNum=0;

        //메뉴 고르기
        while (!isKioskOff) {

            //메인 메뉴 출력
            printMainMenu();

            //메인메뉴 입력값 검사
            mainNum = checkingInput(scanner,1, this.menus.size());

            //입력값에 따른 로직 or 메서드 실행
            if (mainNum >= 1 && mainNum <= this.menus.size()) {
                //서브메뉴 고르기 실행
                pickSubMenu(this.menus.get(mainNum-1), scanner);
            } else if(mainNum ==0) {
                //키오스크 종료
                System.out.println("키오스크를 종료합니다.");
                isKioskOff = true;
                break;
            }


        }
        //스캐너 닫기
        scanner.close();
    }



    //서브메뉴 고르는 메서드
    public void pickSubMenu(Menu menu, Scanner scanner) {

        while (true) {
            //서브메뉴 리스트 출력
            menu.printMenuItemList();

            //선택한 카테고리 내 메뉴 선택
            //입력값 검사 메서드 호출 (int반환)
            int menuItemNum = checkingInput(scanner, 1, 5);

            if (menuItemNum >= 1 && menuItemNum <= 5) {
                //선택한 메뉴 보여주기
                menu.printPickedMenu(menuItemNum);
            } else if (menuItemNum == 0) {
                System.out.println("메인메뉴로 돌아갑니다.");
                break;
            }

        }
    }



    //입력값 예외 처리 메서드
    public int checkingInput(Scanner scanner, int startNo, int endNo) {

        while (true) {

            try {
                System.out.print(startNo + "~" + endNo + " 사이의 숫자를 입력해주세요: ");
                int input = scanner.nextInt();

                if (input >= startNo && input <= endNo) {
                    return input;
                } else if (input == 0) {
                    return input;
                } else {
                    throw new IllegalArgumentException();
                }

            } catch (InputMismatchException e) {
                System.out.println("\n❌ 숫자만 입력해주세요\n");
                scanner.next();//버퍼비우기
            } catch (IllegalArgumentException e) {
                System.out.println("\n❌" + startNo + "~" + endNo + "사이에서 다시 입력해주세요.\n");
            }

        }

    }

    //메인메뉴 목록 출력 메서드
    public void printMainMenu() {

        System.out.println("\n🍔 맘스터치 메뉴 🍔");
        for(int i=0; i<this.menus.size(); i++) {
            String menuCategory = this.menus.get(i).getMenuCategory();
            System.out.println((i+1)+". " + menuCategory);
        }
        System.out.println("0. 종료\n");

    }


    //메인메뉴 전 키오스크 인트로 출력 반환
    public void printBurgerMain() {
        System.out.println("🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔");
        System.out.println("🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔");
        System.out.println("🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔");
        System.out.println("🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔");
        System.out.println("🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔   햄버거 드실라우  🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔");
        System.out.println("🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔");
        System.out.println("🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔");
        System.out.println("🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔");
        System.out.println("🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔🍔");
    }




}