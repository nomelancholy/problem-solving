#include <iostream>
#include "solutions.h"

using namespace std;

void sum_between_two_integers() {
    int a,b;
    long long answer = 0;

    cin >> a >> b;

    if(a>b) {
        for(int i=b; i<=a; i++) {
            answer += i;
        }
    } else {
        for(int i=a; i<=b; i++) {
            answer += i;
        }
    }

    cout << answer;

}
