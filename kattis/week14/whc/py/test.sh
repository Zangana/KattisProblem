#!/bin/bash

mkdir -p samples
FILES=$(ls samples/*.in 2>/dev/null)

if [ -z "$FILES" ]; then
    echo "No test cases!"
    exit
fi

for f in $FILES; do

    # extract base file name
    tag=$( basename "$f" ".in" )

    # run program

    # Uncomment the version you want to use; comment out the version you don't use
    python3 WHC.py <$f >samples/$tag.out
    #python WHC.py <$f >samples/$tag.out

    # check output
    diff -u samples/$tag.out samples/$tag.ans >samples/$tag.diff
    if [ -s samples/$tag.diff ]; then
        echo "Tested $f: FAIL!"
        cat samples/$tag.diff
    else
        echo "Tested $f: pass"
    fi

    echo ""
done
