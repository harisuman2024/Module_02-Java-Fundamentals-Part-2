class Lab43{
public static void main(String str[]){
byte b= 128;
short s = 32768;
int i = 2147483648;
long a= 2147483648;
}
}

/*
if values changes then ?

byte b= 127;
short s = 32767;
int i = 2147483647;
long a= 2147483647;
*/

/*

1) when you assign the values to byte variables in the range of -128 to 127 then those will be considered byte only => beyond the range, value will be considered as int.
2) when you assign the values to short variables in the range of -32,768 to 32,767 then those will be considered short only => beyond the range, value will be considered as int.
3) when you assign the values to int variables in the range of -214,74,83,648 to 214,74,83,647 then those will be considered int otherwise integer is too large.
Activate Windows
4) You need to L for suffix for long values.

*/



