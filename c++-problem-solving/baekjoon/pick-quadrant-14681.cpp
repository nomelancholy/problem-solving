#include <iostream>
#include "solutions.h"

using namespace std;

void pick_quadrant_14681() {
    int x,y, answer;
    cin >> x >> y;

    if(x > 0){
        if(y > 0){
            answer = 1;
        } else {
            answer = 4;
        }
    }

    if(x < 0){
        if(y > 0){
            answer = 2;
        } else {
            answer = 3;
        }
    }

    cout << answer;
}
