#include <iostream>
#include "solutions.h"

using namespace std;

void alarm_clock_2884() {
    int h,m;
    cin >> h >> m;

    m = m -45;

    if(m < 0) {
        h = h-1;
        if(h < 0) {
            h = 23;
        }
        m = m + 60;
    }

    cout << h << " " << m << endl;
}
