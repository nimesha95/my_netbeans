/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juststuff;

/**
 *
 * @author Nimesha
 */
public class Date {
    private int year;
    private int month;
    private int day;
    
    Date(int year,int month,int day){
        setYear(year);
        setMonth(month);
        setDay(day);
    }
    
    void setYear(int year){
        this.year= year;
    }
    void setMonth(int month){
        this.month=month;
    }
    void setDay(int day){
        this.day=day;
    }
    
    int getYear(){
        return year;
    }
    int getMonth(){
        return month;
    }
    int getDay(){
        return day;
    }
}
