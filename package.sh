!/bin/bash
echo "packaging............................";
mvn clean package  -Pdev -Dmaven.test.skip=true  -e
wait