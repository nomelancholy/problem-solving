#include <iostream>
#include "solutions.h"

using namespace std;

void get_biggest_number_2068() {

    int T;
    cin >> T;

    for(int test_case=1; test_case <= T; ++test_case) {

        int biggest_number = 0;

        for(int i=0; i<10; i++) {
            int n;
            cin >> n;

            if(biggest_number < n){
                biggest_number = n;
            }
        }

        cout << "#" << test_case << " " << biggest_number << endl;
    }
}
