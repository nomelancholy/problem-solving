#include <iostream>
#include <string>
#include <algorithm>
#include "solutions.h"

using namespace std;

void count_of_p_and_y() {
    string s;
    bool answer = true;

    int p = 0;
    int y = 0;

    cin >> s;

    for(int i=0; i<s.length(); i++) {

        char c = toupper(s.at(i));

        if(c == 'P') {
            p++;
        } else if(c == 'Y') {
            y++;
        }
    }

    if(p!=y) {
        answer = false;
    }

    cout << answer;

}
