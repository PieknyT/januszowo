#include <iostream>
#include <cstdlib>
#include <time.h>
#include <stdio.h>

using namespace std;

int liczba, strzal, ileProb=0;

int main()
{
    cout << "Witaj! Pomyslalem sobie liczbe od 1 do 100" << endl;
    srand(time(NULL));
    liczba = (rand()%100)+1;
    //cout<<liczba<<endl;

    while(strzal!=liczba)
    {
        ileProb++;
        cout<<"Zgadnij jaka to liczba (To Twoja: "<< ileProb<<" proba.): ";
        cin>>strzal;
        if (strzal==liczba)
        {
            cout<<"Udalo sie w "<<ileProb<<" probie. Odgadnieta liczba to: "<<liczba<< " Wygrywasz!"<<endl;
        }
        else if (strzal>liczba)
        {
            cout<<"To za duza! Podaj nizsza."<<endl;
        }
        else if (strzal<liczba)
        {
            cout<<"To za mala! Podaj wieksza. "<<endl;
        }

    }

    getchar(); getchar();

    return 0;
}
