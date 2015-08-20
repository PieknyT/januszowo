#include <iostream>  // inklud do³aczac

using namespace std; //uzyj przestrzeni nazw,
int uczniowie, cukierki, iloscNaUcznia, resztaDlaJasia;


int main()
{
    cout << "Ile pyzatych uczniow jest w Twojej klasie:";// si aut(konsol autput) wyswietla na ekranie, end line nowa linia
    cin >>uczniowie;

    cout << "Ile cukierkow mama kupila:";
    cin >> cukierki;


     iloscNaUcznia = cukierki/(uczniowie-1);
    cout << "Ilosc cukierkow dla kazdego ucznia: "<<iloscNaUcznia;

    resztaDlaJasia = cukierki-iloscNaUcznia*(uczniowie-1);
    cout<<endl<<"Cukierkow dla Jasia zostalo: "<<resztaDlaJasia;

     return 0;
}
