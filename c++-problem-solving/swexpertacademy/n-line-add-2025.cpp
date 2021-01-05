#include <iostream>
#include "solutions.h"

using namespace std;

void n_line_add_2025() {
    int n;

    cin >> n;

    int sum = 0;

    for(int i=1; i<=n; i++) {
        sum += i;
    }

    cout << sum;

}
