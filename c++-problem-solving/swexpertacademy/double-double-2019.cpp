#include <iostream>
#include "solutions.h"

using namespace std;

void double_double_2019() {
    int input;

    cin >> input;

    int answer = 1;


    for(int i=0; i<=input; i++) {
        cout << answer << " ";
        answer = answer * 2;
    }

}
