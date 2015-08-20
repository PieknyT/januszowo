#include <iostream>
#include <windows.h>
#include <cstdlib>

using namespace std;

int main()
{
    for( int i=10; i>=0; i--)// dopóty warunek jest prawdziwy petla dziala
    {
       Sleep(1000);
       system("cls");
       cout <<i <<endl;
    }
    cout<< "KOcham Cie i zjem Ci wszystkie zelki";
    return 0;
}
