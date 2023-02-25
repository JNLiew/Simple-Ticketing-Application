package com.example.ticketing.backend;

import com.example.ticketing.enums.counter_enum;
import com.example.ticketing.enums.status_enum;

public class backend {
    public static status_enum counter1_status = status_enum.offline;
    public static status_enum counter2_status = status_enum.offline;
    public static status_enum counter3_status = status_enum.offline;
    public static status_enum counter4_status = status_enum.offline;

    public static counter_enum current_counter = counter_enum.c1;
    public static fifoqueue queue = new fifoqueue();
    public static Integer serving_no = 0;

}
