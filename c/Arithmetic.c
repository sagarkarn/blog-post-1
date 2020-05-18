#include<stdio.h>
int main(){
    int num1 = 10;
    int num2 = 5,sum,dif,mul,div,mod;
    sum = num1 + num2,
    dif = num1 - num2,
    mul = num1 * num2,
    div = num1 / num2,
    mod = num1 % num2;

    printf("sum= %d\n",sum);
    printf("different= %d\n",dif);
    printf("multiply = %d\n",mul);
    printf("divide = %d\n",div);
    printf("moduls = %d\n",mod);
    return 0;
}