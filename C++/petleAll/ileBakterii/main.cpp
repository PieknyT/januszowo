#include <iostream>

using namespace std;

int iloscBakteri=1;
int godzin=0;

int main()
{

    while (iloscBakteri<=1000000000)//dopóki warunek jest prawdziwy do sie wykonuje
    {
        godzin++;
        iloscBakteri=iloscBakteri*2;

        cout<<"minelo godzin:"<<godzin;
        cout<<"liczba bakterii: " << iloscBakteri<<endl;
    }

    return 0;
}
