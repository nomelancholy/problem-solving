#include <iostream>
#include "solutions.h"

using namespace std;

void exam_grades_9498() {
    int n;
    cin >> n;
    if(n <= 100 && n >= 90){
        cout << "A";
    }else if(n >= 80){
        cout << "B";
    }else if(n >= 70){
        cout << "C";
    }else if(n >= 60){
        cout << "D";
    }else{
        cout << "F";
    }
}
