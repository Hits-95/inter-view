// 1) find out 1st uppercase letter in string
#include<iostream>
using namespace std;

int isUpperVowel(char ch){
    
    switch(ch){
        case 'A':
        case 'E':
        case 'I':
        case 'O':
        case 'U': return 1;
        default : return 0;
    }
}

int main()
{
    char* str = new char[10];
    cout<<"Enter string : ";
    cin>>str;
    
    for(int i = 0; i < 10; i++)
        if(isUpperVowel(str[i])){
            cout<<"1st capital vowel => " << str[i];
            return 0;
        }

    return 0;
}


//2)
#include<iostream>
using namespace std;

int isVowel(char ch){
    
    switch(ch){
        case 'A':
        case 'E':
        case 'I':
        case 'O':
        case 'U': 
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u': return 1;
        default : return 0;
    }
}

int main()
{
    char* str = new char[10];
    cout<<"Enter string : ";
    cin>>str;
    
    for(int i = 0; i < 10; i++)
        if(isVowel(str[i])){
            cout<<str[i-1] << " ,"<<str[i+1]<<" ,";
        }
}

//3)
#include<iostream>
using namespace std;

int isEven(int num){
    return(num % 2 == 0);
}

void evenPair(int arr[]){
    int given_num = 20;
    
    for(int i = 0; i < 10; i++){
        for(int j = i + 1; j < 10; j++){
            if( isEven(arr[i]) && isEven(arr[j]) && arr[i] + arr[j] == given_num ){
                    cout<<"[ "<<arr[i]<<" ,"<<arr[j]<<" ]";
            }
        }
    }
    
}

int main()
{
    int* arr = new int[10];
    cout<<"Enter array : ";
    for(int i = 0; i<10; i++)
        cin>>arr[i];
    evenPair(arr); 
    
    return 0;
}



//4)
#include<iostream>
using namespace std;

void find(int arr[]){
    
    int* count = new int[10];
    
    for(int i=0; i<10; i++)
        count[arr[i]]++;
  
    for(int i = 0; i<10; i++)
        if(count[i] == 1)
            cout<<endl<<"Result -> "<<i;
}

int main()
{
    int* arr = new int[10];
    cout<<"Enter array : ";
    for(int i = 0; i<10; i++)
        cin>>arr[i];
    find(arr); 
    
    return 0;
}
