/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
#include <iostream>
using namespace std;

void native(string str,string pattern);

void native(string str,string pattern){
    int str_len=str.length();
    int pat_len=pattern.length();
    int state=0;
    int matched_index=0;
    for(int i=0;i<=str_len-pat_len;i++){
        if(str[i]==pattern[0]){
            matched_index=i;
	    state=1;
            for(int j=1;j<pat_len;j++){
                if(str[i+j]==pattern[j]){
                    state=1;
                }
                else{
                    state=0;
                    break;
                }
            }
            if(state==1){
                cout<<matched_index<<endl;
                break;
            }
        }
    }
    if(state==0){
 	   cout<<"There is no substring matching"<<endl;
	}
}
