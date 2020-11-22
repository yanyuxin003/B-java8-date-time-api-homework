package com.thoughtworks.capability.gtb;

import java.time.LocalDate;

/**
 * 计算任意日期与下一个劳动节相差多少天
 *
 * @author itutry
 * @create 2020-05-15_16:33
 */
public class Practice1 {

  public static long getDaysBetweenNextLaborDay(LocalDate date) {
    int month = date.getMonthValue();
    int year = date.getYear();
    if (month <= 5) {
      LocalDate  mayDay = LocalDate.of(year, 5, 1);
      return mayDay.toEpochDay() - date.toEpochDay();
    }else{
      LocalDate mayDay = LocalDate.of(year + 1, 5, 1);
      return mayDay.toEpochDay() - date.toEpochDay();
    }
  }
}
