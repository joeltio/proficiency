// A very basic prime checker with minor optimizations
#include <iostream>
#include <string>
#include <cmath>

using namespace std;

bool prime_checker(int n) {
    if (n < 2) {
        return false;
    } else if (n == 2) {
        return true;
    } else if (n % 2 == 0) {
        return false;
    } else {
        double lim = ceil(sqrt(static_cast<double>(n)));
        for (int i=3; i<lim; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

int main(int argc, char* args[]) {
    int flag = prime_checker(stoi(args[1]));
    string is_prime = flag? "true" : "false";

    cout << is_prime << endl;
}
