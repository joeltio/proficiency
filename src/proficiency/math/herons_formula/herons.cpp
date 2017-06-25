#include <iostream>
#include <cmath>

using namespace std;

double semiperimeter(int a, int b, int c) {
    return (a + b + c)/static_cast<double>(2);
}

double area_of_triangle(int a, int b, int c) {
    double s = semiperimeter(a, b, c);
    return sqrt(s * (s-a) * (s-b) * (s-c));
}

int main(int argc, char * argv[]) {
    int a = stoi(argv[1]);
    int b = stoi(argv[2]);
    int c = stoi(argv[3]);

    cout.precision(17);
    cout << area_of_triangle(a, b, c) << endl;
}
