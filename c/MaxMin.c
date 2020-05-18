#include<stdio.h>
int main(){
    int first,second;
    printf("Enter first number >");
    scanf("%d",&first);
    printf("Enter second number >");
    scanf("%d",&second);
    
    if(first > second){
        printf("Maximum Number = %d\n",first);
        printf("Minumum number = %d",second);
    }else{
        printf("Maximum Number = %d\n",second);
        printf("Minumum number = %d",first);
    }
    return 0;
}