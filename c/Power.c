#include<stdio.h>

int main(){
    int num = 5, p = 4,i,result = 1;
    for(int i = 0; i < 4; i++){
        result *= 5;
    }
    printf("%d^%d = %d",num,p,result);
    return 0;
}