package com.learning.ticketingcore.enums;

/**
 * This enum hold nomenclature for different parts of day.
 */
public enum PartOfDay {

  MORNING("0-13"),
  AFTERNOON("13-17"),
  EVENING("17-21"),
  NIGHT("21-24");

  private String partOfDay;
  private String hour24DayRange;


  PartOfDay(String s) {
  }
}
