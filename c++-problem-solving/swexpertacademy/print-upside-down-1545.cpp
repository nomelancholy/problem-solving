#include <iostream>
#include "solutions.h"

using namespace std;

void print_upside_down_1545() {
    int n;

    cin >> n;

    for(int i=n; i>=0; i--) {
        cout << i << " ";
    }
}
