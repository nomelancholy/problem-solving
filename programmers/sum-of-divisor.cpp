#include <iostream>
#include "solutions.h"

using namespace std;

void sum_of_divisior() {
    int n;
    int answer = 0;

    cin >> n;

    for(int i=1; i<=n; i++) {
        if(n % i==0) {
            answer += i;
        }
    }

    cout << answer;
}
