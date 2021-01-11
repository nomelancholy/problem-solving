#include <iostream>
#include "solutions.h"

using namespace std;

void leap_year_2753() {
    int n;
    cin >> n;

    bool answer = false;

    if(n%4 == 0) {
        if(n%100 != 0 || n % 400 == 0) {
            answer = true;
        }
    }

    cout << answer;
}
