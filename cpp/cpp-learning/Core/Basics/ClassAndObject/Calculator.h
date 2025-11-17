#include <iostream>
using namespace std;

class Calculator{
    private :
        int a;
        int b;

    public : 
        Calculator(int a_, int b_) : a(a_), b(b_) {}

        void add(){
            cout << "Addition is : " << a + b;
        }
        
        void multiply(){
            cout << "Multiplication is : " << a * b;
        }
};