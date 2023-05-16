public class Loops {
	public static void main(String[] args) {
		//
	}
}
/*
Access Modifiers:
	> Default (Package Level Scope)
	> Public (Public Access)
	> Protected (Inherited Classes)
	> Private (Within Class Only)

Loops: They are used to run same block of code multiple times until some condition isn't satisfied.

3 types of loops:

a. Entry controlled loops
1. for : used when number of iterations are fixed

syntax: 
	for(initialization; condition; increment/decrement) {
		//body
	}
	
	ex:
	for(int i=0; i<5; i++) {
		System.out.println("\ni = " + i);
	}
	
	inifinitive syntax:
	for(;;){
		//body
	}


2. while : used when number of iterations are not fixed

syntax:
	initialization;
	while(condition) {
		//body
		
		increment/decrement;
	}
	
	for ex:
	int i=0;
	while(i<5) {
		System.out.println("\ni = " + i);
		
		i++;
	}

	inifinitive syntax:
	while(true) {
		//body
	}


b. Exit Controlled loops
3. do while : used when the body of the loop at least get executed once.

syntax:
	initialization;
	do {
		//body
		
		//increment/decrement;
	} while(condition);

	for ex:
	int i=0;
	do {
		System.out.println("\ni = " + i);
		
		i++;
	} while(i<5);

*/