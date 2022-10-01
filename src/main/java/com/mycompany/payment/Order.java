/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.payment;

/**
 *
 * @author ahmad
 */
public class Order {
    String nama, gula;
    Integer harga, qty;

    public String getNama() {
        return nama;
    }

    public String getGula() {
        return gula;
    }

    public Integer getHarga() {
        return harga;
    }

    public Integer getQty() {
        return qty;
    }

    public Order(String nama, String gula, Integer harga, Integer qty) {
        this.nama = nama;
        this.gula = gula;
        this.harga = harga;
        this.qty = qty;
    }
}

