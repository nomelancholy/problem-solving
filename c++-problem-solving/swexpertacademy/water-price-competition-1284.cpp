#include <iostream>
#include "solutions.h"

using namespace std;

void water_price_competition_1284() {

    int T;
    cin >> T;

    for(int test_case=1; test_case <= T; ++test_case) {
        int p,q,r,s,w, a, b, result;
        cin >> p >> q >> r >> s >> w;

        a = w * p;

        if(w > r) {
            b = q + (w-r) * s;
        } else {
            b = q;
        }

        if(a > b){
            result = b;
        }else {
            result = a;
        }

        cout << "#" << test_case << " " << result << endl;
    }
}
