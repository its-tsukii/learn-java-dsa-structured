#include <bits/stdc++.h>
//This is a non-standard, common header in competitive programming. It essentially includes almost all standard C++ libraries, saving the programmer from writing many individual #include statements.
using namespace std;

int main(){
    // int, char, long int, long long int, float, double
    // -10^9 < int < 10^9
    // -10^12 < long int < 10^12
    // -10^18 < long long int < 10^18
    // 2 < char < 255
    // float values upto 7 decimal 
    // double values upto 17 decimal values
    // going out of these ranges causes an overflow.

    // rather than using cin for everything we can also use a cpp function that is a getline, getline starts reading right after the end of cin and thus creates undefined behaviour due to which we often use cin.ignore()
    //for example
    string str1, str2;
    getline(cin, str1);
    cout << str1 << endl;
    // also when we want to push to a string rather than using a new string then adding one by one string to it its better to just use the push_back function
    string str;
    cin >> str;
    string str_reverse;
    for(int i = str.size() - 1; i>= 0; --i){
        str_reverse.push_back(str[i]);
    }
    cout << str_reverse << endl;
    if(str == str_reverse){
        cout << "YES" << endl;
    }
    else{
        cout << "NO" << endl;
    }
}