char* toLowerCase(char* str){
    char* pInitial = str;
    while (*str != 0) {
        *str++ |= 0x20;
    };
    return pInitial;
}