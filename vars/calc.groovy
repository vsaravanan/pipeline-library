def add(x,y) {
    echo " sum of $x and $y is ${x + y}"
    echo " JOB_NAME mvs ${JOB_NAME} "
    return x + y
}