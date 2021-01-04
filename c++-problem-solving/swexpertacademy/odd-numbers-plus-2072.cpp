#include <iostream>
#include "solutions.h"

using namespace std;

void odd_numbers_plus_2072() {

    int time;
    cin >> time;

    for(int i=0; i<time; i++) {
        int sum = 0;

        for(int j=0; j<10; j++) {
            int input;
            cin >> input;

            if(input % 2 == 1) {
                sum += input;
            }
        }
        cout << "#" << i + 1 << " " << sum << endl;
    }
}
