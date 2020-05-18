#include<iostream>
using namespace std;
int main(){
    int r,sum = 0, temp,num;
    printf("Enter number: ");
    cin >> num;
    
    temp = num;
    while(num > 0){
        r = num % 10;
        sum = (sum * 10) + r;
        num = num/10;
    }
    if(temp == sum){
        cout  << "Palindrome number";
    }
    else{
        cout << "not palindrome number";
    }
}