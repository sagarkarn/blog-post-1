#include<stdio.h>
int main(){
    int num,first,second,third,fourth;
    printf("Enter four digit number: ");
    scanf("%d",&num);
    if(num >999 && num < 10000){
        first = num / 1000;
        num = num % 1000;
        second = num / 100;
        num =  num % 100;
        third = num / 10;
        num =  num % 10;
        fourth = num;
        if(first + fourth == second + third){
            printf("Sum of first and fourth and sum of second and third is same");
        }
        else{
            printf("Sum of first and fourth and sum of second and third is not same");
        }
    }else{
        printf("Enter number greather than 999 and less than 10000");
    }       
    return 0;
}