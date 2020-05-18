#include<iostream>
using namespace std;

int main(){
    int num1 = 10;
    int num2 = 5,sum,dif,mul,div,mod;
    sum = num1 + num2,
    dif = num1 - num2,
    mul = num1 * num2,
    div = num1 / num2,
    mod = num1 % num2;

    cout << "sum= " << sum << "\n";
    cout << "different= " << dif << "\n";
    cout << "multiply = " << mul << "\n";
    cout << "divide = " << div << "\n";
    cout << "moduls = " << mod << "\n";
    return 0;
}