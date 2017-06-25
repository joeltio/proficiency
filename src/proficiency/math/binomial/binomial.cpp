#include <iostream>

using namespace std;

long factorial(int n) {
    long x = 1;
    for (int i=1; i<=n; i++) {
        x *= i;
    }
    return x;
}

long choose(int n, int k) {
    return factorial(n)/(factorial(k) * factorial(n-k));
}

int main(int argc, char *argv[]) {
    int n = stoi(argv[1]);

    for (int k=0; k<=n; k++) {
        long coefficient = choose(n, k);
        int a_exponent = n-k;
        int b_exponent = k;

        cout << coefficient << "a^" << a_exponent << "b^" << b_exponent;
        if (k != n) {
            cout << " + ";
        }
    }

    cout << endl;
}
