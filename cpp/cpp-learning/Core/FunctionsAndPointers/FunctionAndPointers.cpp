#include<bits/stdc++.h>
using namespace std;

void hello(){
    printf("this is the version of function hello ; everything is same as java not too different");
}

int increment (int x){
    return ++x;
}

int increment2 (int &x){
    return ++x;
}

void pointers(){
    cout <<"pointers are a datatype that basically just say like *p is at value , &p stores the address of the variable and internally every &p is multiplied by its byte value for 1 byte is equal to 8 bits and so on"<<endl;
    int *p;
    int x = 99;
    p = &x;
    cout <<"value of x via pointer is : " << x <<endl; // 99
    cout <<"value of x via pointer is : " << *p <<endl; // 99
    // since a pointer is a refer than even changing the x changes the pointers
    x = 98;
    cout <<"value of x via pointer is : " << *p <<endl; // 98
    // even changing the value of *p will change the value of the x
    *p = 150;
    cout <<"value of x : " << x <<endl; // 150
    cout <<"value of x via pointer is : " << *p <<endl; // 150
    // but changing the value of address that is &p will result in increase of the address or decrease depending on the operation and will return a hex
    cout <<" before changing p" << endl;
    cout << "p = " << p << endl;
    cout << "*p = " << *p << endl;
    //before 
    cout <<" after changing p" << endl;
    p++;
    cout << "p = " << p << endl;
    cout << "*p = " << *p << endl;

}
int main(){
    hello();
    int x = 5, y = 5;
    cout << endl << x << endl;
    increment(x);
    cout << endl << x << endl << "if you could see the value does not change simple because the value is passed by value that the system copies the value rather than using the original value " << endl;
    increment2(x);
    cout << x << endl << "but here the value changes since we are doing call by reference the system refers to the original value" << endl;
    pointers();
}
/*
---output---
value of x via pointer is : 99
value of x via pointer is : 99
value of x via pointer is : 98
value of x : 150
value of x via pointer is : 150
 before changing p
p = 0x61fed8        // the original hex
*p = 150            // the original p pointing to x
 after changing p   // see the hex is increased by about 4 bits
p = 0x61fedc        // increased by 4 bits hex
*p = 6422236        // an meaningless value form the stack since p now points to an incremented value which is does not know about 
*/