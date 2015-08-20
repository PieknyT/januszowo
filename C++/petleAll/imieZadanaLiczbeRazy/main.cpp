#include <iostream>

using namespace std;
string imie;A
int  liczba;

int main()
{
    cout << "Podaj swoje imie: ";
    cin>> imie;
    cout << "Podaj liczbe calkowita: ";
    cin>> liczba;

    for (int i=1; i<=liczba; i++)
    {
        cout<< i<<"."<<imie<<" to super bohater"<<endl;
    }

    return 0;
}
