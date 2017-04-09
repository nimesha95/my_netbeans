#include <iostream>

using namespace std;

const int size = 128;       //Maximum number of ascii value is 128
int globalHolder[size];     //This is the table defined globally  




void CalculateLast(string pattern);
int last(char ltr);
void testcase1();

int main(int argc, char** argv) {
    testcase1();
    return 0;
}

void testcase1(){
    string test = "aaaaaaa";
    CalculateLast(test);
    for(int i=0;i<test.length();i++){
        cout << "last(" << test[i] << ") : " << last(test[i]) << endl; 
    }
}


void CalculateLast(string pattern){
    for(int i=0;i< size;i++){
        globalHolder[i]=-1;
    }
    for(int i=pattern.length()-1; i>=0 ;i--){
        if (globalHolder[(int) pattern[i]] == -1){
            globalHolder[(int) pattern[i]] = i;
        }
    }
}   

int last(char ltr){
    int num = (int) ltr;
    return globalHolder[num];
}