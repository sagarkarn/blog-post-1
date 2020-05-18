#include<iostream>
using namespace std;
int main(){
    int num;
    cout << "Enter number: ";
    cin >> num;
    if(num % 3 == 0 && num % 13 == 0){
        cout << "number is divisible by 3 and thirteen";
    }
    else{
        cout << "number is not divisible by 3 and thirteen";
    }
    return 0;
}