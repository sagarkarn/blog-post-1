#include<iostream>
using namespace std;

int main(){
    int num = 5, p = 4,i,result = 1;
    for(int i = 0; i < 4; i++){
        result *= 5;
    }
    cout << num << "^"<< p <<"= " << result;
    return 0;
}