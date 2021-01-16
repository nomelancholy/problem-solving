#include <iostream>
#include "solutions.h"

using namespace std;

void sum_8393() {
    int n;
    cin >> n;

    int sum = 0;

    for(int i=1; i<=n; i++){
        sum += i;
    }

    cout << sum;
}
