#include <iostream>
#include "solutions.h"

using namespace std;

void rest_10430() {
    int a,b,c;
    cin >> a >> b >> c;
    cout << (a+b) % c << endl << ((a%c) + (b%c))%c << endl << (a*b) % c << endl << ((a%c)*(b%c))%c ;
}
