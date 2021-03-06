package ir.ac.kntu.model;

import ir.ac.kntu.view.ViewAsHtml;

import java.util.Objects;

public class DateModel implements ViewAsHtml {
  private int year;
  private int month;
  private int day;

  // Default Constructor for jackson
  public DateModel() {
  }

  public DateModel(int year, int month, int day) {
    this.year = year;
    this.month = month;
    this.day = day;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public int getMonth() {
    return month;
  }

  public void setMonth(int month) {
    this.month = month;
  }

  public int getDay() {
    return day;
  }

  public void setDay(int day) {
    this.day = day;
  }

  @Override
  public String toString() {
    return year + "-" + month + "-" + day;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DateModel dateModel = (DateModel) o;
    return year == dateModel.year &&
            month == dateModel.month &&
            day == dateModel.day;
  }

  @Override
  public int hashCode() {
    return Objects.hash(year, month, day);
  }

  @Override
  public String generateHtml() {
    return "<td>" + year + "/" + month + "/" + day + "</td>";
  }
}
