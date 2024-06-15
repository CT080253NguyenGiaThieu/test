/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.do_an_cuoi_khoa;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author tuan anh
 */
public class Do_an_cuoi_khoa {
    public static void show(Calendar c)
    {
        System.out.printf("Ngay: %d, Thang: %d, Nam: %d, Gio: %d, Phut: %d, Giay: %d\n", c.get(Calendar.DAY_OF_MONTH), c.get(Calendar.MONTH), c.get(Calendar.YEAR), c.get(Calendar.HOUR_OF_DAY), c.get(Calendar.MINUTE),c.get(Calendar.SECOND));
    }
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        show(c);
        c.add(Calendar.MONTH, -2);
        c.add(Calendar.DAY_OF_MONTH,20);
        show(c);
    }
}
