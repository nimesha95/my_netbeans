#include <stdlib.h>
#include <stdio.h> 
int swap(int *a,int *b);
int main(){
    int a,b;
    scanf("%d%d",&a,&b);
    swap(&a,&b);
    printf("%d\n%d",a,b);
}
int swap(int *a,int *b){
    int temp;
    temp=*a;
    *a=*b;
    *b=temp;
}