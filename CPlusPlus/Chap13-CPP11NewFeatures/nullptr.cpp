#include <iostream>
using namespace std;

#ifndef NULL
#define NULL 0 /* standard C++ definition */
#endif

void f( int i ) {
	printf("the int is %d\n", i);
}

void f( char * s ) {
	printf("the pointer is %p\n", s);
}

int main( int argc, char ** argv ) {
	f(NULL);
	return 0;
}
