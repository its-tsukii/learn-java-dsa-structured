#include<bits/stdc++.h>
using namespace std;

int main(){
    int n, m;
    cin >> n >> m;
    int a[n][m];
    for(int i=0; i < n; ++i){
        for(int j = 0; j < m; ++j){
            cin >> a[i][j];
        }
    }
    for(int i=0; i < n; ++i){
        for(int j = 0; j < n; ++j){
            cout << a[i][j] << " ";
        }
        cout << endl;
    }
    // you would sometime also encounter segmentation fault and paging fault 
    // segmentation fault occurs when we are trying to access a value that is not yet defined for example int a[10]; but we try to access a[11] or we try to set a[11]=2 this although would result in segmentation it sometimes works on some machine that is an undefined behaviour
    // paging fault occurs when your machine or os runs out of cache space or simply speaking cannot allot anymore cache for tlb or paging 
}

// here n, m acts as the size of the multi dimensional array that is sort of a[i][j] mostly synced with a*j
// to create a array we must first define the size of the array although every bit value is at the same time multiplied by 4 and in pointer terms is then also multiplied by 4 depending on the int value
// after creation to read the values we use the cin function with two loops since there are now multiple variables in this case that is i and j for example a[1][2] in matrix terms its like a12
// same with output we use two loops to cout the matrix
// although in a real setting we would be using while loop rather than for loop since for loop uses more variables
// dont forget the conditions for for loop are not at all mandatory same with while loop they can run even without conditions just they will either result in infinite loop or something else
// in cpp or any programming language its almost known that any int value is true while 0 is false thus while(1) would be an infinite loop and while(--t) would run till t becomes zero and while(0) wouldnt even execute.
