#include<stdio.h>

int main() {

    int n;
    int mid;

    scanf("%d", &n);

    if (n == 0) {
                printf("0");
            } else if (n <= 2) {
                printf("NIE");
            } else if(n ==3){
                printf("2 0 3 1");
            }
                else {

        mid = n / 2;

        if(n%2 == 0) {

            for(int i = 0; i < mid; i++) {
                printf("%d %d", i, mid + 1 + i);
                if(i != mid-1) {
                    printf(" ");
                }
            }
           printf(" %d", mid);


        } else {
            for(int i = 0; i <= mid; i++) {
                printf("%d %d", i, mid + 1 + i);
                if(i != mid) {
                    printf(" ");
                }
            }

        }

    }

    return 0;

}