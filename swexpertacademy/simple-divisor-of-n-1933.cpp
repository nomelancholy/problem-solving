#include <iostream>
#include "solutions.h"

using namespace std;

void simple_divisor_of_n_1933() {
    int n;
    cin >> n;

    for(int i=1; i<=n; i++){
        if(n % i == 0){
            cout << i << " ";
        }
    }
}
