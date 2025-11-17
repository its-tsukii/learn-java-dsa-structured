#include <stdio.h>
#include <iostream>
#include <vector>
using namespace std;

class Vectors {
    // Can be extended
};

class Arrays {
public:
    void StaticArraysDemo(){
        cout << "\n--- Static Array Demo ---\n" << endl;
        int arr[5] = {1,2,3,4,5};
        for (int i = 0; i < 5; i++)
        {
            printf("arr[%d] = %d \n", i, arr[i]);
            cout << endl;
        }
        
    }

    void DynamicArraysDemo(){
        cout << "\n--- Dynamic Array Demo ---\n";
        int size;
        cout << "Enter size of dynamic array: ";
        cin >> size;
        
        int* arr = new int[size];
        for (int i = 0; i < size; i++)
        {
            printf("arr[%d] = %d \n", i, arr[i]);
            cout << endl;
        }
        
    }
};

int main() {
    // Static 1D array
    int nums_static[5] = {1, 2, 3, 4, 5};
    for (int n : nums_static) {
        cout << n << endl;
    }

    // Static 2D array
    int matrix[2][3] = {
        {1, 2, 3},
        {4, 5, 6}
    };
    for (auto& row : matrix) {
        for (int val : row) {
            cout << val << endl;
        }
    }

    // Vector example
    vector<int> vec = {1, 2, 3};
    vec.push_back(4);
    for (int m : vec) {
        cout << m << endl;
    }

    return 0;
}