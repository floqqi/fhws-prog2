package ws1314.exercise03;

import java.util.Arrays;

public class Date implements Comparable<Date> {
    private int day, month, year;

    Date(int d, int m, int y) {
        day = d;
        month = m;
        year = y;
    }

    public String toString() {
        return day + "." + month + "." + year;
    }

    public java.util.Date toDate() {
        return new java.util.Date(this.year, this.month, this.day);
    }

    public int compareTo(Date other) {
        return this.toDate().compareTo(other.toDate());
    }

    public static void main(String[] args) {
        Date[] dates = new Date[]{
                new Date(31, 12, 2014),
                new Date(15, 3, -44),
                new Date(9, 11, 1989),
                new Date(3, 10, 1990)
        };
        Arrays.sort(dates);
        for (Date d : dates) {
            System.out.println(d.toString());
        }
    }
}
