package com.example.kiosk.cart;

import com.example.kiosk.menu.MenuItem;
import java.util.*;

public class Cart {


    private double totalPrice;
    private List<MenuItem> cartList = new LinkedList<>();
    private Map<MenuItem,Integer> cartQuantityList = new HashMap<>();



    public Map<MenuItem, Integer> getCartQuantityList() {
        return cartQuantityList;
    }

    public void setCartQuantityList(Map<MenuItem, Integer> cartQuantityList) {
        this.cartQuantityList = cartQuantityList;
    }

    public List<MenuItem> getCartList() {
        return cartList;
    }

    public void setCartList(List<MenuItem> cartList) {
        this.cartList = cartList;
    }

    public void setTotalPrice() {
        for(MenuItem item : this.cartList) {
            this.totalPrice += item.getMenuPrice();
            System.out.println(this.totalPrice);
        }
    }

    public double getTotalPrice() {
        return this.totalPrice;
    }



    //기능들

    //장바구니 추가
    public void addCartList (MenuItem item) {
        this.cartList.add(item);
    }


    //장바구니 목록 출력 (수량 출력 기능)
    public void printCartList() {
        setTotalPrice();

        System.out.println("\n--------------------------------------------------------");
        System.out.println("🍔 장바구니 🍔");
        System.out.println("--------------------------------------------------------");

        //Map에 장바구니 목록의 수량까지 저장
        addcartQuantityList();

        //출력문
        for(MenuItem item : this.cartQuantityList.keySet()) {
            System.out.printf(" %-15s| W %5.1f | 수량: %d | %s%n", item.getMenuName(), item.getMenuPrice(), cartQuantityList.get(item), item.getMenuInfo());
        }
        System.out.println("--------------------------------------------------------");
        System.out.printf(" 총금액 : %.1f%n", this.totalPrice);
        System.out.println("--------------------------------------------------------");
        System.out.println("1. 주문          | 2. 메뉴판 돌아가기");
        System.out.println();
    }


    //Map에 장바구니 목록의 수량까지 저장
    public void addcartQuantityList() {
        for(MenuItem item : this.cartList) {
            Integer count = cartQuantityList.get(item);
            if(count == null) {
                cartQuantityList.put(item, 1);
            } else {
                cartQuantityList.put(item, count + 1);
            }
        }
    }


    //장바구니 비우기
    public void makeEmptyCart() {
        this.cartList.clear();
        this.totalPrice = 0.0;
        System.out.println("장바구니를 초기화합니다.");
    }
}