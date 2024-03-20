def add(x,y) {
    echo " sum of $x and $y is ${x + y}"
    echo " JOB_NAME  ${JOB_NAME}   "
    echo " appVer  ${appVer}   "
    return x + y
}