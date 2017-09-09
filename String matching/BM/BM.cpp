#include <iostream>
using namespace std;

int arr[128];

void BM(string str,string pattern);
void calc_last(string pattern);
int last(char ltr);


void BM(string str,string pattern){
	calc_last(pattern);
	int cur_index=0;
	int pat_len=pattern.length();
	int str_len=str.length();
	int shift;
	int hh=0;

	while(cur_index <= str_len-pat_len){
		for(int i=pat_len-1;i>=0;i--){
			if(pattern[i] != str[cur_index+i]){
				if(str[cur_index+i]<i){
					shift=i-last(str[cur_index+i]);
				}				
				else{
					shift=1;
				}
				cur_index += shift;
				hh=0;				
				break;
			}
			else{
				hh=1;
			}		
		}
		if(hh==1){
			cout<<"Pattern exists: "<<cur_index<<endl;
			break;
		}
		
	}
	if(hh==0)
		cout<<"pattern doesn't exist"<<endl; 
}


void calc_last(string pattern){
	for(int i=0;i<128;i++){
		arr[i]=-1;
	}
	for(int i=pattern.length()-1;i>=0;i--){
		if(arr[(int)pattern[i]]==-1){
			arr[(int)pattern[i]]=i;
		}
	}
}

int last(char ltr){
	int num=(int) ltr;
	return arr[num];
}
