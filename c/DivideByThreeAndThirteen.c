#include<stdio.h>
int main(){
    int num;
    printf("Enter number: ");
    scanf("%d",&num);
    if(num % 3 == 0 && num % 13 == 0){
        printf("number is divisible by 3 and thirteen");
    }
    else{
        printf("number is not divisible by 3 and thirteen");
    }
    return 0;
}