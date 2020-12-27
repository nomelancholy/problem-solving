#include <iostream>
#include "solutions.h"

using namespace std;

void big_small_same_2070() {

    int T;
    cin >> T;

    for(int test_case=1; test_case <= T; ++test_case) {
        int n, m;
        cin >> n >> m;

        string result;

        if(n > m) {
            result = ">";
        } else if(n < m) {
            result = "<";
        } else {
            result = "=";
        }

        cout << "#" << test_case << " " << result << endl;
    }
}
