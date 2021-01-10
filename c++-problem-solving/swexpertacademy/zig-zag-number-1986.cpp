#include <iostream>
#include "solutions.h"

using namespace std;

void zig_zag_number_1986() {

    int T;
    cin >> T;

    for(int test_case=1; test_case <= T; ++test_case) {
        int n;
        cin >> n;

        int answer = 0;

        for(int i=1; i<= n; i++){
            if(i%2==1){
                answer += i;
            }else {
                answer -= i;
            }
        }

        cout << "#" << test_case << " " << answer << endl;
    }
}
