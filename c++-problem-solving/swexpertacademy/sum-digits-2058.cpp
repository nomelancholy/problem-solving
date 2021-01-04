#include <iostream>
#include "solutions.h"

using namespace std;

void sum_digits_2058() {

    int n;
    cin >> n;

    int sum = 0;

    while (n != 0 ) {
        sum += n % 10;
        n = n / 10;
    }

    cout << sum << endl;

}
