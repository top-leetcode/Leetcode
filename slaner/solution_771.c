typedef unsigned long long UINT64;
typedef unsigned char BYTE;
const UINT64 ONE = 1ULL;

int numJewelsInStones(char * J, char * S){
    UINT64 jewel = 0, stone = 0;
    BYTE i = 0, count = 0, p;
    while (J[i] != 0) {
        p = J[i] - 'A';
        if (J[i] >= 'a') p = J[i] - 'a' + 26;
        
        jewel |= ONE << p;
        i++;
    }
    
    i = 0;
    while (S[i] != 0) {
        p = S[i] - 'A';
        if (S[i] >= 'a') p = S[i] - 'a' + 26;
        
        stone = ONE << p;
        if (jewel & stone) count++;
        i++;
    }
    
    return count;
}