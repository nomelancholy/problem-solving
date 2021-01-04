#include <iostream>
#include <cmath>
#include "solutions.h"

using namespace std;

void get_average_value_2071() {

    int time;
    cin >> time;

    for(int i=0; i<time; i++) {
        double sum = 0;

        for(int j=0; j<10; j++) {
            int input;
            cin >> input;
            sum += input;
        }

        cout << "#" << i + 1 << " " << (int)round(sum/10) << endl;
    }
}
