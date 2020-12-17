#include <iostream>
#include "solutions.h"

using namespace std;

void even_number_and_odd_number(){
    int number;
    cin >> number;

    if(number % 2 == 0){
        cout << "Even";
    }else {
        cout << "Odd";
    }
}
