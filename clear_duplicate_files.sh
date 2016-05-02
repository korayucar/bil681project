#!/usr/bin/env bash
for filename in data/*; do
#    echo `echo $filename | grep -o "\d.*" `
    if  ! grep  `echo  $filename  | grep -o "\d.*" ` unique_data_files.txt ; then
        echo "removing duplicate data $filename"
        rm $filename;
    fi
done