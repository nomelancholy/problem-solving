#include <iostream>
#include <string>
#include <algorithm>
#include "solutions.h"

using namespace std;

void newspaper_headline_2047() {
    string s, answer;

    cin >> s;

    for(int i=0; i<s.length(); i++) {

        answer += toupper(s.at(i));

    }

    cout << answer;

}
