/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   swap.h
 * Author: Nimesha
 *
 * Created on December 2, 2016, 11:05 PM
 */

void swap(int *a,int *b){
    int tmp;
    tmp = *a;
    *a=*b;
    *b=tmp;
}

