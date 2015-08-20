#include <iostream>

using namespace std;
int wiek;


int main()
{
    cout << "Podaj ile masz lat:";
    cin >> wiek;

    if(wiek<18)
    {
        cout <<"Jestes niepelnoletni i nie mozesz zostac prezydentem." << endl;
    }
    else if ((wiek>=18)&&(wiek<=35))
    {
        cout<< "Jestes pelnoletni, ale nie mozesz zostac prezydentem." << endl;
    }
    else
    {
        cout<< "Jeste pelnoletni i mozesz kandydowac na prezydenta.";
    }
    return 0;
}
