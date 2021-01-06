#include <iostream>
#include "solutions.h"

using namespace std;

void rock_paper_scissors_1936() {
    int a, b;

    char c;

    cin >> a >> b;

    switch(a) {
    case 1:
        if(b==2) {
            c = 'B';
        } else if(b==3) {
            c = 'A';
        }
        break;
    case 2:
        if(b==1) {
            c = 'A';
        } else if(b==3) {
            c = 'B';
        }
        break;
    case 3:
        if(b==1) {
            c = 'B';
        } else if(b==2) {
            c = 'A';
        }
        break;
    }

    cout << c;

}
