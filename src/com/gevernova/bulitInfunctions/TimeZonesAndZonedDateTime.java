package com.gevernova.bulitInfunctions;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeZonesAndZonedDateTime {
    public static void main(String[] args) {
        ZonedDateTime gmt = ZonedDateTime.now(ZoneId.of("GMT"));
        System.out.println("Time in GMT: " + gmt);
        ZonedDateTime ist = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("Time in IST: " + ist);
        ZonedDateTime pst = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println("Time in PST: " + pst);
    }
}
