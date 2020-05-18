#include<iostream>
using namespace std;
int main(){
    int first,second;
    cout << "Enter first number >";
    cin >> first;
    cout << "Enter second number >";
    cin >> second;
    
    if(first > second){
        cout << "Maximum Number = " << first << endl;
        cout << "Minumum number = " << second << endl;
    }else{
        cout << "Maximum Number = " << second << endl;
        cout << "Minumum number = " << first << endl;
    }
    return 0;
}