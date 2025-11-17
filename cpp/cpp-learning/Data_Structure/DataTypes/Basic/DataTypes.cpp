#include <stdio.h>

int main() {
    char ch = 'a' + 4;      // 'a' = 97 → 97 + 4 = 101 → 'e'
    char ch2 = 97 + 2;      // 97 + 2 = 99 → 'c'
    char ch3 = 0;           // ASCII 0 → Null character '\0' (not printable)
    char ch4 = 48;          // ASCII 48 → '0'

    printf("%c %c %c %c", ch, ch2, ch3, ch4);

    return 0;
}
