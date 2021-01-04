#include <iostream>
#include "solutions.h"

using namespace std;

void print_quotient_and_remainder_2029() {
    int T;
    cin >> T;

    for(int test_case=1; test_case <= T; ++test_case) {

        int quotient,remainder,a,b;

        cin >> a >> b;

        quotient = a/b;
        remainder = a%b;

        cout << "#" << test_case << " " << quotient << " " << remainder << endl;
    }
}
