#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>
void roman(int);

int main() {
    printf("%d",roman(5));
    }


void roman(int a){
    char temp[20];
    int count=0;
    while(1){
        if (a>=1000){
            a=a-1000;
            temp[count]='Z';
            count++;
        }
        else if(a>=100){
            a=a-100;
            temp[count]='Y';
            count++;
        }
        else if(a>=10){
            a=a-10;
            temp[count]='X';
            count++;
        }
        else if(a>=5){
            a=a-5;
            temp[count]='V';
            count++;
        }
        else if(a>=1){
            a=a-1;
            temp[count]='I';
            count++;
        }
        else{
            break;
        }
    }
    return(temp);
}
