#include <iostream>
#include "solutions.h"

using namespace std;

void compare_two_numbers_1330() {
    int a,b;
    cin >> a >> b;

    if(a > b) {
        cout << ">"<< endl ;
    } else if (a < b) {
        cout << "<"<< endl ;
    } else {
        cout << "==" << endl ;
    }
}
