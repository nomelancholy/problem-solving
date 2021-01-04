#include <iostream>
#include "solutions.h"

using namespace std;

void print_dialog_line_2027() {


    for(int i=0; i<5; i++) {
        for (int j=0; j<5; j++) {
            if(i==j){
                cout << "#";
            }else {
                cout << "+";
            }
        }
        cout << endl;
    }
}
